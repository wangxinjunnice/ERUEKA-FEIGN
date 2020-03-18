package com.cn.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/get")
    public Object get(){

        Map<String,Object> map=new HashMap<>();
        map.put("feign","调用成功");
        return map;

    }

}
