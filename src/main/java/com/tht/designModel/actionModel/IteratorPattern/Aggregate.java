package com.tht.designModel.actionModel.IteratorPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract com.tht.designModel.actionModel.IteratorPattern.Iterator createIterator();
}

