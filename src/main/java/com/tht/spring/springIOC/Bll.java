package com.tht.spring.springIOC;

/**
 * Created by thrall on 2018/12/7.
 */
public class Bll implements IAdd  {
    public void Add(String a, String b) {
        System.out.println("现在执行字符串连接");
        System.out.println(a+b);
    }

    public void Add(int a, int b) {
        System.out.println("现在执行整形求和");
        System.out.println(a+b);
    }

    public void Add(float a, float b) {
        System.out.println("现在执行浮点求和");
        System.out.println(a+b);
    }


}
