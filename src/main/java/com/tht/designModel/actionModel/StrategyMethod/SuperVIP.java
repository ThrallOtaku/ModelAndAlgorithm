package com.tht.designModel.actionModel.StrategyMethod;

/**
 * Created by thrall on 2018/11/27.
 */
public class SuperVIP implements CalPrice {
    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice*0.8;
    }
}
