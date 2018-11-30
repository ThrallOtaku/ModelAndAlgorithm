package com.tht.designModel.structureModel.decoratorMethod;

/**
 * Created by thrall on 2018/11/26.
 */
public class Decorator3 implements Sourceable {

    private Sourceable sourcable;
    public Decorator3(Sourceable sourcable){
        super();
        this.sourcable=sourcable;
    }
    public void operation() {
        System.out.println("第3个装饰器前");
        sourcable.operation();
        System.out.println("第3个装饰器后");

    }

}