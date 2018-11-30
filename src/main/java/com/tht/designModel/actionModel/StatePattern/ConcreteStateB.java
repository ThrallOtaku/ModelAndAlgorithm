package com.tht.designModel.actionModel.StatePattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class ConcreteStateB implements State{
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }
}
