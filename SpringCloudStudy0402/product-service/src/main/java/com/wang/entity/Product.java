package com.wang.entity;

/**
 * @Desc Product Entity
 * @Author wang926454
 * @Date 2018/7/12 14:45
 */
public class Product {
    private String code;
    private String name;
    private int num;

    public Product(String code, String name, int num){
        this.code = code;
        this.name = name;
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
