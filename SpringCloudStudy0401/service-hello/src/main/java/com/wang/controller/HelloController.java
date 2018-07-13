package com.wang.controller;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc Hello
 * @Author wang926454
 * @Date 2018/7/10 17:34
 */
@RestController
public class HelloController {
    // 日志打印
    protected Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;
    @Value("${server.port}") // 获取配置中的端口号
    private int serverPort = 0;

    @GetMapping("/hello")
    public String hello() {
        // 输出日志，EurekaInstanceConfig的配置信息
        this.logger.info("hello, instanceId:{}, host:{}", eurekaInstanceConfig.getInstanceId(), eurekaInstanceConfig.getHostName(false));
        return "Hello, Spring Cloud! My port is " + String.valueOf(serverPort);
    }
}
