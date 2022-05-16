package com.hcl2.service.impl;

import com.hcl2.entity.Stock;
import com.hcl2.dao.StockDao;
import com.hcl2.service.StockService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Stock)表服务实现类
 *
 * @author makejava
 * @since 2022-05-08 16:12:46
 */
@Service("stockService")
public class StockServiceImpl implements StockService {
    @Resource
    private StockDao stockDao;

    public void Reduce(int id) {
      this.stockDao.reduce(id);
    }
}
