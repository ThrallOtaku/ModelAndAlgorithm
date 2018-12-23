package com.tht.designModel.createModel.singletonMethod;

/**
 * Created by thrall on 2018/11/23.
 *　在内部创建一个实例，构造器全部设置为private，所有方法均在该实例上改动，在创建上要注意类的实例化只能执行一次，可以采用许多种方法来实现，
 * 如Synchronized关键字，或者利用内部类等机制来实现。
 * 推荐用法
 */
public class Singleton {
    //只要构造函数是private 都是singleton

    //饿汉式的单例加载，这里不需要synchronized，因为static资源在classloder机制下加载
    //避免了多线程的同步问题
    private Singleton() {
    }
    private static  Singleton instance=new Singleton();
    public  static Singleton getInstance(){
       return instance;
    }
}

