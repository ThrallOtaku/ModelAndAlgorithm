package com.tht.designModel.createModel.abstruckFactoryMethod;

/**
 * Created by thrall on 2018/11/23.
 */
public class FactoryForB implements produce {
    @Override
    public food get() {
        return new B();
    }
}
