package com.cn.controller;


import com.cn.feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test1")
public class Test1 {

    @Autowired
    private Feign feign;

    @GetMapping("/findAll")
    public Object find(){

        Map<String,Object> map = (Map<String, Object>) feign.get();
        return map;

    }



}
