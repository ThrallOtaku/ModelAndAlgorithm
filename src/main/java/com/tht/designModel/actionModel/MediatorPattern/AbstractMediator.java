package com.tht.designModel.actionModel.MediatorPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public interface AbstractMediator {
    //中介者通过此方法来改变同事B
    public void aChangedB(String str);

    //中介者通过此方法来改变同事A
    public void bChangedA(String str);
}
