package com.tht.designModel.actionModel.MediatorPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class ConcreteMediator implements AbstractMediator {
    // 持有并维护同事A
    private ConcreteColleagueA colleagueA;
    // 持有并维护同事B
    private ConcreteColleagueB colleagueB;

    // 传入同事A的对象
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    // 传入同事B的对象
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    /**
     * 收到同事A的改变，通知同事B改变
     */
    @Override
    public void aChangedB(String str) {
        colleagueB.changeString(str);
    }

    /**
     * 收到同事B的改变，通知同事A改变
     */
    @Override
    public void bChangedA(String str) {
        colleagueA.changeString(str);
    }

}
