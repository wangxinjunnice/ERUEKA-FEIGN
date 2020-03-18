package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka客户端
 * feign被调用方
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClient1 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1.class);
    }
}
