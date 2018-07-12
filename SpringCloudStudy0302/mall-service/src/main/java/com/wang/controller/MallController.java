package com.wang.controller;

import com.wang.feignclient.MallFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(method = RequestMethod.GET)
    public List<Object> list() {
        return mailFeignService.list();
    }

    @RequestMapping(value = "/map", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String,Object> list2() {
        return mailFeignService.list2();
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public Object selectByCode(@PathVariable String code) {
        return mailFeignService.selectByCode(code);
    }
}
