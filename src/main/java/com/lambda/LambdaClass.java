package com.lambda;

import java.util.HashMap;
import java.util.Map;


public class LambdaClass {


    public static void main(String[] args) {


        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "1");
        map.put("12", "12");
        map.put("13", "13");


        map.forEach((k, v) -> System.out.println(k + "" + v));

        MyInterface l = new MyInterface() {
            @Override
            public void m1() {
                System.out.println("m1 method called");
            }
        };
        l.m1();


        MyInterface l2 = () -> {
            System.out.println("m2 method called suing lambda");
        };
        l2.m1();
    }



}