package com.cn.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = FeignUtils.SERVER_CLIENT1)
public interface Feign {

    @GetMapping("/test/get")
    public Object get();

}
