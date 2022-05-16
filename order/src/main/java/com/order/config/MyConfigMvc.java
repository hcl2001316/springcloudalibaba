package com.order.config;

import com.order.intercepter.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 黄小爷
 * @description 注册拦截器
 */
@Configuration
public class MyConfigMvc implements WebMvcConfigurer {

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**") //拦截所有请求，包括静态资源文件
                .excludePathPatterns("/", "/login", "/index.html", "/user/login", "/css/**", "/images/**", "/js/**", "/fonts/**");
    }


    public void addViewControllers(ViewControllerRegistry registry) {
        //当访问 “/” 或 “/index.html” 时，都直接跳转到登陆页面
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        //添加视图映射 main.html 指向  dashboard.html
        registry.addViewController("/main.html").setViewName("main");
    }
}
