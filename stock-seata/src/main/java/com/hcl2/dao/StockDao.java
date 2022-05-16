package com.hcl2.dao;

import com.hcl2.entity.Stock;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Stock)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-08 16:12:45
 */
public interface StockDao {



    void reduce(int id);
}

