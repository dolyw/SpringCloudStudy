package com.wang.service.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FeignClient接口
 * @Author wang926454
 * @Date 2018/7/11 16:01
 */
@FeignClient(value = "service-hello",fallback = HelloFeignServiceHystrixImpl.class)
public interface HelloFeignService {
    /**
     * hello
     * @param 
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/7/31 17:24
     */
    @GetMapping("/hello")
    String hello();
}
