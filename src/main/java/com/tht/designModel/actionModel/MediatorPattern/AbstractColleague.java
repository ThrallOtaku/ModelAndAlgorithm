package com.tht.designModel.actionModel.MediatorPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public abstract class AbstractColleague {
    //同事对象在改变的时候，通知中介者，并传递影响值
    public abstract void setString(String str, AbstractMediator am);
    //同事对象提供一个接口接收中介者传递的影响值
    public abstract void changeString(String str);

}
