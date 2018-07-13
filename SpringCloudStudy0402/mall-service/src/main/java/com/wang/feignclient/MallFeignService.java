package com.wang.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Desc FeignClient接口
 * @Author wang926454
 * @Date 2018/7/11 16:01
 */
@FeignClient(value = "product-service", fallback = MallFeignServiceHystrixImpl.class)
public interface MallFeignService {
    @GetMapping("/product")
    public List<Object> list();

    /**
     * @Desc 返回Map型Json
     * @Author wliduo
     * @Date 2018/7/12 15:23
     */
    @GetMapping("/product/map")
    public Map<String,Object> list2();

    @GetMapping("/product/{code}")
    public Object selectByCode(@PathVariable("code") String code);
}
