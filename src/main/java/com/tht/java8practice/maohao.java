package com.tht.java8practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thrall on 2018/11/26.
 * :: 遍历打印对象或者数组都很好用
 */
public class maohao {
    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
