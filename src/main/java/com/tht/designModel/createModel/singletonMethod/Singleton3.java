package com.tht.designModel.createModel.singletonMethod;

/**
 * Created by thrall on 2018/12/13.
 * 懒汉模式，不推荐，效率比较低
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3 (){}
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
