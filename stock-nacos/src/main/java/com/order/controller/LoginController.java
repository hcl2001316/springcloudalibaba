package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 黄小爷
 * @description
 */
@RestController
@RequestMapping("/stock")
public class LoginController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/reduce")
    public String reduce(){
        return "小黄"+port;
    }


    @RequestMapping("/reduce2")
    public String reduce4545(){
       int i;
       i=1/0;
        return "小黄"+port;
    }
}
