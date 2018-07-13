package com.wang.controller;

import com.wang.feignclient.MallFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Desc 调用FeignClient接口方法
 * @Author wang926454
 * @Date 2018/7/10 17:34
 */
@RestController
@RequestMapping("/prod")
public class MallController {

    private final MallFeignService mailFeignService;

    @Autowired
    public MallController(MallFeignService mailFeignService){
        this.mailFeignService = mailFeignService;
    }

    @GetMapping
    public List<Object> list() {
        return mailFeignService.list();
    }

    @GetMapping(value = "/map", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String,Object> list2() {
        return mailFeignService.list2();
    }

    @GetMapping("/{code}")
    public Object selectByCode(@PathVariable String code) {
        return mailFeignService.selectByCode(code);
    }
}
