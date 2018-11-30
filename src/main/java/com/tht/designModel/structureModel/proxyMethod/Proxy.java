package com.tht.designModel.structureModel.proxyMethod;

/**
 * Created by thrall on 2018/11/26.
 */
public class Proxy implements Subject {
    private Subject subject;

    //构造代理类，代理类构造器用默认的参数
    //隐藏原类对客户的可见性
    public Proxy(){
        //关系在编译时确定
        subject = new RealSubject();
    }

    public void doAction(){
        System.out.println("proxy do action");
        subject.doAction();
    }
}
