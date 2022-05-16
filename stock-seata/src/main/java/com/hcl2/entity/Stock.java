package com.hcl2.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * (Stock)实体类
 *
 * @author makejava
 * @since 2022-05-08 16:12:45
 */
@Repository
public class Stock implements Serializable {
    private static final long serialVersionUID = 148728452196127435L;
    
    private Integer id;
    
    private Integer stockCount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

}

