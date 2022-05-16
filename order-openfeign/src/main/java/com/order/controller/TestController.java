package com.order.controller;

//import com.order.feign.LoginController;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.order.feign.SentinelOpen;

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
public class TestController {
//    @Autowired
//    LoginController loginController;

    @Autowired
    SentinelOpen sentinelOpen;

    @ResponseBody
    @RequestMapping("add2")
    public String add2(){
        String result = sentinelOpen.reduce2();
        System.out.println("fsdfsdf");
        return "你好呀~~故意谷45455656歌6666666666666"+result;
    }

    @ResponseBody
    @RequestMapping("add")
    public String add(){
        String result = sentinelOpen.reduce();
        return "你好呀~~"+result;
    }




    @RequestMapping("/hhh")
    @ResponseBody
    @SentinelResource(value = "hhh",blockHandler ="hotErr2")
    public String hhh(){
        return "测试测试1111";
    }

    public String hotErr2(BlockException ex){
        return "测试流控111111";
    }
}
