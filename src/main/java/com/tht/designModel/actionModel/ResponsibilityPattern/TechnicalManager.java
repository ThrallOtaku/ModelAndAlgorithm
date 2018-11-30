package com.tht.designModel.actionModel.ResponsibilityPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class TechnicalManager extends Handler  {
    public TechnicalManager() {
        super(1);
    }

    @Override
    public void report(Demand demand) {
        System.out.println("需求：" + demand.detail());
        System.out.println(getClass().getSimpleName() + "：小猿我挺你，这个需求不干");
    }
}
