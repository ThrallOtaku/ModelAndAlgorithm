package com.tht.designModel.actionModel.VisitorsPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class ConcreteClass1 extends Element {
    @Override
    public void doSomething() {
        System.out.println("这是Element1");
    }

    @Override
    public void accept(Ivisitor visitor) {
        visitor.visit(this);
    }

}
