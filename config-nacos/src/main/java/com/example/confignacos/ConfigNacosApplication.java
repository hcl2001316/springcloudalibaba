package com.example.confignacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigNacosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConfigNacosApplication.class, args);
        String name = context.getEnvironment().getProperty("user.name");
        String age = context.getEnvironment().getProperty("user.age");
        String tenk = context.getEnvironment().getProperty("user.tenk");
        System.err.println(name+"====="+age+"======="+tenk);
    }

}
