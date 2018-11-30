package com.tht.designModel.actionModel.ResponsibilityPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class DemandA implements Demand{
    @Override
    public int demandLevel() {
        return 1;
    }

    @Override
    public String detail() {
        return "A级任务";
    }
}
