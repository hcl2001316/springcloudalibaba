package com.example.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.stereotype.Service;

/**
 * @author 黄小爷
 * @description
 */
@Service
public class ServiceImpl implements Iservice{

    @SentinelResource(value = "ha",blockHandler = "userHcl")
    public String ha() {
        return "我我我哦我";
    }

    public String userHcl(BlockException x){
        return "我被流控了";
    }
}
