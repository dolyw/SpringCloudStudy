package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient // 表明自己是一个EurekaClient
@EnableFeignClients // 开启Feign的功能
@SpringBootApplication
@EnableHystrix // 启用Hystrix断路器容错保护
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
