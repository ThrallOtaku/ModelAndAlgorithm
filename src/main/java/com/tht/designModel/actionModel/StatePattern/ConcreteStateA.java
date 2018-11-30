package com.tht.designModel.actionModel.StatePattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class ConcreteStateA implements State  {

    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }
}
