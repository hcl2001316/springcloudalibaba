package com.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 黄小爷
 * @description
 */
@Controller
@RequestMapping("/my")
public class LoginController {
    @RequestMapping("hcl")
    @ResponseBody
    public String login(){
        return "你好呀~~";
    }
}
