package com.tht.designModel.structureModel.decoratorMethod;

/**
 * Created by thrall on 2018/11/26.
 */
public class Decorator2 implements Sourceable {

    private Sourceable sourcable;
    public Decorator2(Sourceable sourcable){
        super();
        this.sourcable=sourcable;
    }
    public void operation() {
        System.out.println("第2个装饰器前");
        sourcable.operation();
        System.out.println("第2个装饰器后");

    }

}