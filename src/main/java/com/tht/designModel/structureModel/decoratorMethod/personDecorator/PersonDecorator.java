package com.tht.designModel.structureModel.decoratorMethod.personDecorator;

/**
 * Created by thrall on 2018/11/26.
 * 人除了行动还需要别的东西装饰一下吧，人会戴眼镜、穿衣服以及其他的装饰的东西
 * 就是不修改原有方法的基础上用装饰器来增加新的功能
 */
public class PersonDecorator implements Person {
    private Person person;

    //通过构造器的方式注释person实例
    public PersonDecorator(Person person){
        this.person=person;
    }

    @Override
    public void action() {
        person.action();
        System.out.println("戴眼镜");
        System.out.println("带手串");
    }
}
