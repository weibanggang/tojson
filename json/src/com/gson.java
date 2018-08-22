package com;

import com.google.gson.Gson;
import sun.rmi.runtime.Log;

import java.util.Date;

public class gson {
    public static void main(String[] args) {
        System.out.println(toJson(new user(1, "张三", "男", new Date())));
    }
    public static String toJson(Object obj){
        String re=null;
            Gson gson=new Gson();
        re= gson.toJson(obj);
        return  re;
    }
}
