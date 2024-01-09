package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Demo;

import java.util.List;

/**
 * *  @author：zhangyifan
 * *  date：2024/1/9 17:07
 * *  describe：
 */

public interface DemoService {
    /**
     * 查询所有元素
     * @return 所有元素
     */
    List<Demo> selectAll();
}
