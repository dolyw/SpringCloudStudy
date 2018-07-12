package com.wang.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc FeignClient接口
 * @Author wang926454
 * @Date 2018/7/11 16:01
 */
@FeignClient("product-service")
@RequestMapping("/product")
public interface MallFeignService {
    @RequestMapping(method = RequestMethod.GET)
    public List<Object> list();

    /**
     * @Desc 返回Map型Json
     * @Author wliduo
     * @Date 2018/7/12 15:23
     */
    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public Map<String,Object> list2();

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public Object selectByCode(@PathVariable("code") String code);
}
