package com.hcl.entity;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2022-05-08 16:11:57
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -43788399933446418L;
    
    private Integer id;
    
    private Integer orderCount;

    public Order() {
    }

    public Order(Integer id, Integer orderCount) {
        this.id = id;
        this.orderCount = orderCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

}

