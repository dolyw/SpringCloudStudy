package com.wang.controller;

import com.wang.entity.Product;
import com.wang.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc Product Controller
 * @Author wang926454
 * @Date 2018/7/10 17:34
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    /**
     * 日志打印
     */
    protected Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> list() {
        return productService.list();
    }

    /**
     * @Desc 返回Map型Json
     * @Author wliduo
     * @Date 2018/7/12 15:23
     */
    @GetMapping(value = "/map", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String,Object> list2() {
        List<Product> list = productService.list();
        Map<String,Object> map = new HashMap<String,Object>(16);
        map.put("list", list);
        return map;
    }

    @GetMapping("/{code}")
    public Product selectByCode(@PathVariable String code) {
        return productService.selectByCode(code);
    }
}
