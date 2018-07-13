package com.wang.controller;

import com.netflix.appinfo.EurekaInstanceConfig;
import com.wang.service.feignclient.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc 调用FeignClient接口方法
 * @Author wang926454
 * @Date 2018/7/10 17:34
 */
@RestController
public class HelloController {

    private final HelloFeignService helloFeignService;

    public HelloController(HelloFeignService helloFeignService){
        this.helloFeignService = helloFeignService;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloFeignService.hello();
    }
}
