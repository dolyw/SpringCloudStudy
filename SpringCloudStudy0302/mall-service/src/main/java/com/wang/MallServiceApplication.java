package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * @author Wang926454
 * @date 2018/7/31 17:22
 */
// 表明自己是一个EurekaClient
@EnableEurekaClient
// 开启Feign的功能
@EnableFeignClients
@SpringBootApplication
public class MallServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallServiceApplication.class, args);
    }
}
