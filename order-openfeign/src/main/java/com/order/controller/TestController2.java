package com.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.bouncycastle.crypto.agreement.jpake.JPAKEUtil;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄小爷
 * @description
 */
@RestController
@RequestMapping("/hcl")
public class TestController2 {
    @RequestMapping("/hot/{id}")
    @SentinelResource(value = "hot",blockHandler ="hotErr")
    public String hot(@PathVariable("id") Integer id){
        return "访问的id为"+id;
    }

    public String hotErr(@PathVariable("id") Integer id, BlockException ex){
        return "热点流控";
    }


    @RequestMapping("/hhh")
    @SentinelResource(value = "hhh",blockHandler ="hotErr2")
    public String hhh(){
        return "测试测试";
    }

    public String hotErr2(BlockException ex){
        return "测试流控";
    }
}
