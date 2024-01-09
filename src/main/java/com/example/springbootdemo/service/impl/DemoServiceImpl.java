/**
 * Copyright (c) 2024, CCSSOFT All Rights Reserved.
 */
package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.Demo;
import com.example.springbootdemo.mapper.DemoMapper;
import com.example.springbootdemo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * DemoServiceImpl
 *
 * @author zhangyifan
 * @since 2024/1/9
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    private DemoMapper demoMapper;

    /**
     * 查询所有元素
     *
     * @return 所有元素
     */
    @Override
    public List<Demo> selectAll() {
        return demoMapper.selectAll();
    }
}
