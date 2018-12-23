package com.tht.designModel.structureModel.proxyMethod;

/**
 * Created by thrall on 2018/11/26.
 * 代理模式：这种实现也叫静态代理
 */
public class test {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.doAction();
    }
}
