package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient // 表明自己是一个EurekaClient
@EnableFeignClients // 开启Feign的功能
@EnableHystrix // 启动Hystrix监控
@SpringBootApplication
public class MallServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallServiceApplication.class, args);
    }
}
