package com.tht.designModel.actionModel.VisitorsPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public abstract  class Element {
    //业务逻辑
    public abstract void doSomething();
    //定义外部访问接口
    public abstract void accept(Ivisitor visitor);
}
