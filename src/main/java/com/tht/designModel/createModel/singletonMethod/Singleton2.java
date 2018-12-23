package com.tht.designModel.createModel.singletonMethod;

/**
 * Created by thrall on 2018/12/6.
 */
public class Singleton2 {

    /**
     * 双重校验锁
     * volatile 关键词就是直接读取主内存
     * 对一些变量的操作通常是在该线程的寄存器或是CPU缓存上进行的，
     * 之后才会同步到主存中，而加了volatile修饰符的变量则是直接读写主存
     * 就是不会一个变量已经写了但是只写到二级缓存或者三级缓存，还没同步到主存
     */
    private volatile static Singleton2 instance=null;

    private Singleton2(){
    }

    /**
     * 双重检验锁的instance
     * @return
     */
    public static Singleton2 getInstance(){
        if(instance==null){
            //访问instance的代码
            synchronized (instance){
                if(instance==null){
                    instance=new Singleton2();
                }
            }
        }
        return instance;
    }
}
