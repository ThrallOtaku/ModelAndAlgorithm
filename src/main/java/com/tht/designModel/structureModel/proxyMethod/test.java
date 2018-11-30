package com.tht.designModel.structureModel.proxyMethod;

/**
 * Created by thrall on 2018/11/26.
 */
public class test {

    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.doAction();
    }
}
