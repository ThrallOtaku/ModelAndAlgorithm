package com.tht.designModel.createModel.singletonMethod;

/**
 * Created by thrall on 2018/12/6.
 * 死锁发生的条件
 * 1.不剥夺	进程已经获得的资源，未使用完之前不能强行剥夺
   2.请求与保持	一个进程一个进程因请求资源而阻塞时，对已获得的资源保持不放
   3.互斥	一个资源每次只能被一个进程使用
   4.循环等待	若干进程之间形成一种头尾相接的循环等待资源关系

 下面的程序会造成死锁，因为如果线程1在执行method1()的时候，获取String对象的锁，
 而线程2在执行method2()的时候获取Integer对象的锁，
 双方就会进入无休止的互相等待状态，因为双方都想获取对方已获取的对象锁。
 */
public class DeadLockDemo {
    public void method1(){
        synchronized (String.class){
            System.out.println("acquired lock on String.class object");
        }
        synchronized (Integer.class){
            System.out.println("acquired lock on Integer.class object");
        }
    }

    public void method2(){
        synchronized (Integer.class){
            System.out.println("acquired lock on Integer.class object");
        }
        synchronized (String.class){
            System.out.println("acquired lock on String.class object");
        }
    }
}
