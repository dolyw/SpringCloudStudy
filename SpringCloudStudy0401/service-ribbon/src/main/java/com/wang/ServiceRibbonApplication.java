package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient // 表明自己是一个EurekaClient
@SpringBootApplication
@EnableHystrix // 启用Hystrix断路器容错保护
public class ServiceRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced // 客户端负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
