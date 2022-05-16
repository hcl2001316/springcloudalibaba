package com.hcl2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.hcl2.dao")
@EnableFeignClients
public class StockSeataApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockSeataApplication.class, args);
    }


}
