package com.hcl.dao;

import com.hcl.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Order)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-08 16:11:57
 */
public interface OrderDao {

    int insert(Order order);


}

