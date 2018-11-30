package com.tht.designModel.structureModel.decoratorMethod.personDecorator;

/**
 * Created by thrall on 2018/11/26.
 */
public class PersonImpl implements Person {
    @Override
    public void action() {
        System.out.println("人会行动");
    }
}
