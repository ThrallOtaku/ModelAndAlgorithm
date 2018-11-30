package com.tht.designModel.actionModel.TemplatePattern;

/**
 * Created by thrall on 2018/11/30.
 * 模板模式就是在父类中定义好了接口，以及接口方法的执行顺序
 * 子类实现接口就行，然后调用父类的统一执行顺序
 */
public class test {
    public static void main(String[] args) {
        DodishTemplate eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("-----------------------------");

        DodishTemplate bouilli = new Bouilli();
        bouilli.dodish();
    }
}
