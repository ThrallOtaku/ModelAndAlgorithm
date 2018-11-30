package com.tht.designModel.actionModel.StatePattern;

/**
 * Created by thrall on 2018/11/30.
 */
public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
