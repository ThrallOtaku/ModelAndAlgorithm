package com.tht.designModel.actionModel.ResponsibilityPattern;

/**
 * Created by thrall on 2018/11/30.
 * 责任链模式
 * 层级逐级报告模式
 */
public class test {
    public static void main(String[] args) {
        Demand demandA = new DemandA(); // 请求等级低
        Demand demandB = new DemandB(); // 请求等级高

        Boss boss = new Boss();
        TechnicalManager technicalManager = new TechnicalManager();
        technicalManager.setNextHandler(boss); // 设置下一级

        technicalManager.handleMessage(demandA);
        System.out.println("============================");
        technicalManager.handleMessage(demandB);
    }
}
