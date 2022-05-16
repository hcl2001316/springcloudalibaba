package com.hcl2.controller;

import com.hcl2.entity.Stock;
import com.hcl2.service.StockService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Stock)表控制层
 *
 * @author makejava
 * @since 2022-05-08 16:12:44
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    /**
     * 服务对象
     */
    @Resource
    private StockService stockService;

    @RequestMapping("/reduce/{id}")
    public void redus(@PathVariable("id") Integer id){
        stockService.Reduce(id);
    }
}

