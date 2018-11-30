package com.tht.designModel.actionModel.MediatorPattern;

/**
 * Created by thrall on 2018/11/30.
 * 中介者模式就相当于有个中间人，来协调多方的关系，中介相当于是统一的入口
 */
public class test {
    public static void main(String[] args) {
        // 实例化同事A、B
        ConcreteColleagueA colleagueA = new ConcreteColleagueA("大家好，我是同事A。");
        ConcreteColleagueB colleagueB = new ConcreteColleagueB("大家好，我是同事B。");
        // 同时把同事A、B传入给中介者
         ConcreteMediator am = new ConcreteMediator();
         am.setColleagueA(colleagueA); am.setColleagueB(colleagueB);
         //同事A影响同事B
         System.out.println(colleagueB.getStrAttribute());
         colleagueA.setString("同事A传递给同事B的值", am);
         System.out.println(colleagueB.getStrAttribute());
         System.out.println("==========================");
         //同事B影响同事A System.out.println(colleagueA.getStrAttribute());
         colleagueB.setString("同事B传递给同事A的值", am);
         System.out.println(colleagueA.getStrAttribute()); }

}
