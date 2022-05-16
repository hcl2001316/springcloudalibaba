package com.order.config;

import com.order.interceptor.FeignInterceptor;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 黄小爷
 * @description
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

//
//    @Bean
//    public FeignInterceptor feignInterceptor(){
//        return new FeignInterceptor();
//    }
}
