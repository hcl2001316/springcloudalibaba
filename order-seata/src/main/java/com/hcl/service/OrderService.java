package com.hcl.service;

import com.hcl.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2022-05-08 16:11:57
 */
public interface OrderService {


    Order insert(Order order);
}
