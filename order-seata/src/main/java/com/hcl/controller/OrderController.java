package com.hcl.controller;

import com.hcl.entity.Order;
import com.hcl.feign.StockService;
import com.hcl.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2022-05-08 16:11:56
 */
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;


    @Autowired
    StockService stockService;

    @GlobalTransactional
    @RequestMapping("/add2")
    public void addOrder2(){
    stockService.redus(1);
        int i=1/0;
    }


    @Autowired
    RestTemplate restTemplate;

    @GlobalTransactional
    @RequestMapping("/add")
    public void addOrder(){
        Order insert = orderService.insert(new Order(null, 1));
        System.out.println(insert);

        restTemplate.getForObject("http://stock-seata/stock/reduce/1",Integer.class);
        int i=1/0;
    }
}

