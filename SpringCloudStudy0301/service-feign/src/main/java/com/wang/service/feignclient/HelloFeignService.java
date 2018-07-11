package com.wang.service.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Desc FeignClient接口
 * @Author wang926454
 * @Date 2018/7/11 16:01
 */
@FeignClient("service-hello")
public interface HelloFeignService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
