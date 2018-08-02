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
    /**
     * TODO：list
     * @param 
     * @return java.util.List<java.lang.Object>
     * @author Wang926454
     * @date 2018/7/31 17:28
     */
    @GetMapping("/product")
    public List<Object> list();

    /**
     * TODO：返回Map型Json
     * @param 
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @author Wang926454
     * @date 2018/7/31 17:28
     */
    @GetMapping("/product/map")
    public Map<String,Object> list2();

    /**
     * TODO：selectByCode
     * @param code
     * @return java.lang.Object
     * @author Wang926454
     * @date 2018/7/31 17:28
     */
    @GetMapping("/product/{code}")
    public Object selectByCode(@PathVariable("code") String code);
}
