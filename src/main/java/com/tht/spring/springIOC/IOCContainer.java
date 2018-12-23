package com.tht.spring.springIOC;

/**
 * Created by thrall on 2018/12/7.
 * SPRING IOC简单实现
 * https://blog.csdn.net/echoshinian100/article/details/77977823
 * 构造第三方容器，由这个容器来负责实例化接口的实现并向应用类注入。在真实应用中，
 * 很多框架都包含这种功能，如spring mvc之类的，这类工具称为IOC容器，从而实现各个类之间的解耦
 */
public class IOCContainer {
    public static void main(String[] args) {
        //实例化IAdd接口的实现
        Bll bll=new Bll();
        //为应用类注入实现
        Application app=new Application(bll);
        //调用应用类
        app.Run();
    }
}
