package com.wang.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Desc 调用service-hello服务
 * @Author wang926454
 * @Date 2018/7/11 13:41
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloHystrix")
    public String hello(){
        return restTemplate.getForObject("http://SERVICE-HELLO/hello", String.class); // 服务名必须大写
    }

    public String helloHystrix() {
        return "ribbon error";
    }
}
