package com.tht.designModel.structureModel.decoratorMethod;

import com.tht.designModel.structureModel.decoratorMethod.personDecorator.Person;
import com.tht.designModel.structureModel.decoratorMethod.personDecorator.PersonDecorator;
import com.tht.designModel.structureModel.decoratorMethod.personDecorator.PersonImpl;

/**
 * Created by thrall on 2018/11/26.
 */
public class test {
    public static void main(String[] args) {
//        Sourceable sourceable=new Source();
//
//        Sourceable obj=new Decorator1(sourceable);
//        obj.operation();

        //给人类添加别的行动,但是不改人类的接口
        //和代理模式的区别客户指定了装饰者需要装饰的是哪一个类
        Person person= new PersonImpl();
        Person person1=new PersonDecorator(person);
        person1.action();

//        Sourceable obj=new Decorator1(new Decorator2(new Decorator3(sourceable)));
//        obj.operation();
    }
}
