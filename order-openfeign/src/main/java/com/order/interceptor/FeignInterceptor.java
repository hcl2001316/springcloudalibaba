package com.order.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 黄小爷
 * @description
 */
public class FeignInterceptor implements RequestInterceptor {
    Logger logger= LoggerFactory.getLogger(this.getClass());
    public void apply(RequestTemplate requestTemplate) {
        logger.info("我是拦截器");
    }
}
