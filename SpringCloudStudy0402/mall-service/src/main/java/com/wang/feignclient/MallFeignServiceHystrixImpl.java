package com.wang.feignclient;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author wang926454
 * @Date 2018/7/13 14:13
 */
@Component
public class MallFeignServiceHystrixImpl implements MallFeignService {
    @Override
    public List<Object> list() {
        List<Object> error = new ArrayList<Object>();
        error.add("error");
        error.add("404");
        return error;
    }

    @Override
    public Map<String, Object> list2() {
        Map<String, Object> error = new HashMap<String, Object>();
        error.put("error", list());
        return error;
    }

    @Override
    public Object selectByCode(String code) {
        return null;
    }
}
