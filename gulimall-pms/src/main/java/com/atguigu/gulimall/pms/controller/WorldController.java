package com.atguigu.gulimall.pms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    @Value("${spring.datasource.username}")
    private String val;
    @GetMapping
    public String world(){

        String msg = "world" + val;
        return "world";
    }
}
