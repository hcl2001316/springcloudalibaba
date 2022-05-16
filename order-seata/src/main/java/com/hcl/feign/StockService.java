package com.hcl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 黄小爷
 * @description
 */
@FeignClient(value = "stock-seata",path = "/stock")
public interface StockService{
    @RequestMapping("/reduce/{id}")
    public void redus(@PathVariable("id") Integer id);
}
