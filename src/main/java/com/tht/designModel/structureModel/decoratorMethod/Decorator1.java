package com.tht.designModel.structureModel.decoratorMethod;

/**
 * Created by thrall on 2018/11/26.
 * 给一类对象增加新的功能，装饰方法与具体的内部逻辑无关。
 */
public class Decorator1 implements Sourceable {
    private Sourceable sourceable ;

    //构造装饰器。原类作为构造器的入参
    //不隐藏原类对客户的可见性
    public Decorator1(Sourceable sourceable){
        super();
        this.sourceable=sourceable;
    }

    @Override
    public void operation() {
        System.out.println("使用第一个装饰器之前");
        sourceable.operation();
        System.out.println("使用第一个装饰器之后");
    }


}
