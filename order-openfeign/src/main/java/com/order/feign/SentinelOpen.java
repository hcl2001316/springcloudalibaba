package com.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 黄小爷
 * @description
 */
@FeignClient(name = "stock-service",path = "/stock",fallback = SentinelOpenImpl.class)
public interface SentinelOpen {
    @RequestMapping("/reduce2")
    public String reduce2();

    @RequestMapping("/reduce")
    public String reduce();
}
