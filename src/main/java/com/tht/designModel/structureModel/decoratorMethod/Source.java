package com.tht.designModel.structureModel.decoratorMethod;

/**
 * Created by thrall on 2018/11/26.
 */
public class Source implements Sourceable {
    @Override
    public void operation() {
        System.out.println("source print");
    }
}
