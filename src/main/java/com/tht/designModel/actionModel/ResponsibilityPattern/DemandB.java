package com.tht.designModel.actionModel.ResponsibilityPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class DemandB implements Demand {
    @Override
    public int demandLevel() {
        return 2;
    }

    @Override
    public String detail() {
        return "B级任务";
    }
}
