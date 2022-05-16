package com.hcl2.service;

import com.hcl2.entity.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (Stock)表服务接口
 *
 * @author makejava
 * @since 2022-05-08 16:12:46
 */
@Service
public interface StockService {



    void Reduce(int id);

}
