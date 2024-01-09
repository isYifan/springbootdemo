/**
 * Copyright (c) 2024, CCSSOFT All Rights Reserved.
 */
package com.example.springbootdemo.entity;

import lombok.Data;

/**
 * Demo
 *
 * @author zhangyifan
 * @since 2024/1/9
 */
@Data
public class Demo {
    /**
     * ID
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 手机号
     */
    private String telPhone;
}
