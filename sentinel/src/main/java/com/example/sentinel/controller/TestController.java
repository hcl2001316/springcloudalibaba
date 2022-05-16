package com.example.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.sentinel.service.Iservice;
import com.example.sentinel.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄小爷
 * @description
 */
@RestController
public class TestController {
    @RequestMapping("/hcl")
    @SentinelResource(value = "hcl",blockHandler = "exceptionHandler")
    public String hello(){
        return "你好";
    }

    public String exceptionHandler(  BlockException ex) {
        // Do some log here.
        ex.printStackTrace();
        return "流控了";
    }

    @RequestMapping("/add")
    public String add(){
        return "秒杀商品";
    }

    @RequestMapping("/select")
    public String select(){
        return "查询商品";
    }


    @Autowired
    Iservice service;

    @RequestMapping("/test1")
    public String test1(){
        return service.ha();
    }

    @RequestMapping("/test2")
    public String test2(){
       return service.ha();
    }

}
