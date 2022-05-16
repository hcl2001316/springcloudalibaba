package com.order.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author 黄小爷
 * @description
 */
@Controller
@RequestMapping("/order")
public class LoginController {
    @Autowired
    RestTemplate restTemplate;
    @ResponseBody
    @RequestMapping("add")
    public String add(){
        String result = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        return "你好呀~~"+result;
    }
}
