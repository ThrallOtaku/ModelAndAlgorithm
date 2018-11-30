package com.tht.designModel.structureModel.proxyMethod;

/**
 * Created by thrall on 2018/11/26.
 */
public class RealSubject implements Subject {

    @Override
    public void doAction() {
        System.out.println("realSub do action");
    }
}
