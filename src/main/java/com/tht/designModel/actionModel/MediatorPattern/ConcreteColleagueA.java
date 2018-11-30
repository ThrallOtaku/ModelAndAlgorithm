package com.tht.designModel.actionModel.MediatorPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class ConcreteColleagueA extends AbstractColleague {
    // 同事A的字符串属性
    private String strAttribute;

    // 构造函数，构造字符串属性
    public ConcreteColleagueA(String str) {
        this.strAttribute = str;
    }

    /**
     * 被改变的函数
     */
    @Override
    public void changeString(String str) {
        this.strAttribute = this.strAttribute + "这是同事B对我的影响：" + str;
    }

    /**
     * 改变时，通知中介者改变其他同事
     */
    @Override
    public void setString(String str, AbstractMediator am) {
        am.aChangedB(str);
    }

    public String getStrAttribute() {
        return strAttribute;
    }

}
