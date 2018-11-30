package com.tht.designModel.actionModel.VisitorsPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public interface Ivisitor {
    //通过重载定义可以访问哪些对象
    public void visit(ConcreteClass1 concreteClass);
    public void visit(ConcreteClass2 concreteClass);
}
