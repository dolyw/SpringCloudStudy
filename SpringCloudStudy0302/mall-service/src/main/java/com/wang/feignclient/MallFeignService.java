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
    /**
     * list
     * @param 
     * @return java.util.List<java.lang.Object>
     * @author Wang926454
     * @date 2018/7/31 17:20
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Object> list();

    /**
     * 返回Map型Json
     * @param 
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author Wang926454
     * @date 2018/7/31 17:21
     */
    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public Map<String,Object> list2();

    /**
     * selectByCode
     * @param code
     * @return java.lang.Object
     * @author Wang926454
     * @date 2018/7/31 17:21
     */
    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public Object selectByCode(@PathVariable("code") String code);
}
