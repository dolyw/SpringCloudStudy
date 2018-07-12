package com.wang.service;

import com.wang.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc Product Service
 * @Author wang926454
 * @Date 2018/7/12 14:40
 */
@Service
public class ProductService {
    /**
     * @Desc 获取所有Product
     * @Author wang926454
     * @Date 2018/7/12 14:50
     */
    public List<Product> list(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("001", "Product001" , 111));
        products.add(new Product("002", "Product002" , 222));
        products.add(new Product("003", "Product003" , 333));
        products.add(new Product("004", "Product004" , 444));
        products.add(new Product("005", "Product005" , 555));
        return products;
    }

    /**
     * @Desc 根据code查询Product
     * @Author wang926454
     * @Date 2018/7/12 14:53
     */
    public Product selectByCode(String code){
        List<Product> products = this.list();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getCode().equals(code)){
                return products.get(i);
            }
        }
        return null;
    }
}
