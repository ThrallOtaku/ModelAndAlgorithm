package com.tht.designModel.actionModel.VisitorsPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class Visitor implements Ivisitor {
    public void visit(ConcreteClass1 concreteClass) {
        //定义业务逻辑
        concreteClass.doSomething();
    }

    public void visit(ConcreteClass2 concreteClass) {
        //定义业务逻辑
        concreteClass.doSomething();
    }

}
