package com.tht.designModel.actionModel.VisitorsPattern;

import java.util.List;

/**
 * Created by thrall on 2018/11/30.
 * 访问者模式
 * 一家超市是一个object，里面卖的商品是element，导购员就是visitor。
 * 超市没必要改变它所卖的商品的摆放规则，导购员就可以为有着不同消费需求的顾客，
 * 选购出他们所需要的产品。
 * 其实导购员选购的过程，就是在遍历这个超市的所有商品，
 * 这就回到了访问者模式设计的出发点上
 */
public class test {
    public static void main(String[] args) {
        List<Element> list = ElementGenerator.generate(10);
        Ivisitor visitor = new Visitor();
        for (Element element : list) {
            element.accept(visitor);
        }
    }

}
