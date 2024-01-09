/**
 * Copyright (c) 2024, CCSSOFT All Rights Reserved.
 */
package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Demo;
import com.example.springbootdemo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * DemoController
 *
 * @author zhangyifan
 * @since 2024/1/9
 */
@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/list")
    public List<Demo> test() {
        return demoService.selectAll();
    }
}
