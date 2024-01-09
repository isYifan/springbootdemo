package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.Demo;

import java.util.List;

/**
 * *  @author：zhangyifan
 * *  date：2024/1/9 17:08
 * *  describe：
 */

public interface DemoMapper {
    /**
     * 查询所有元素
     * @return 所有元素
     */
    List<Demo> selectAll();
}
