package com;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class faskjson {
    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(new user(1, "张三", "男", new Date())));
    }

}
