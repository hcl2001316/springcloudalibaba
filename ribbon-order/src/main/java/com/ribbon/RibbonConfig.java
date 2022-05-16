package com.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 黄小爷
 * @description
 */
@Configuration
public class RibbonConfig {
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
