package com.wang.service.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FeignClient接口
 * @Author wang926454
 * @Date 2018/7/11 16:01
 */
@FeignClient("service-hello")
public interface HelloFeignService {

    /**
     * hello
     * @param
     * @return java.lang.String
     * @author Wang926454
     * @date 2018/7/31 17:10
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
