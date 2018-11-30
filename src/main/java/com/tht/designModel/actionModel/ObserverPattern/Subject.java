package com.tht.designModel.actionModel.ObserverPattern;


/**
 * Created by thrall on 2018/11/30.
 *
 */
public interface Subject {
    //添加观察者
    void addObserver(Observer obj);
    //移除观察者
    void deleteObserver(Observer obj);
    //当主题方法改变时,这个方法被调用,通知所有的观察者
    void notifyObserver();
}
