package com.wang.service.feignclient;

import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author wang926454
 * @Date 2018/7/13 11:43
 */
@Component
public class HelloFeignServiceHystrixImpl implements HelloFeignService {
    @Override
    public String hello() {
        return "feign error";
    }
}
