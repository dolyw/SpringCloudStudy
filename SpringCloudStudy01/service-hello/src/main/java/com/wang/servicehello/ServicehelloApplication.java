package com.wang.servicehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 *
 * @author Wang926454
 * @date 2018/7/31 17:00
 */
// 表明自己是一个EurekaClient
@EnableEurekaClient
// 设置Controller包路径
@SpringBootApplication(scanBasePackages = "com.wang.controller")
public class ServiceHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHelloApplication.class, args);
    }
}
