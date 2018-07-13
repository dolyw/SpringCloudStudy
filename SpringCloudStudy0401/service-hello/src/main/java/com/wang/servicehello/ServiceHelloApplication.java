package com.wang.servicehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient // 表明自己是一个EurekaClient
@SpringBootApplication(scanBasePackages = "com.wang.controller") // 设置Controller包路径
public class ServiceHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHelloApplication.class, args);
    }
}
