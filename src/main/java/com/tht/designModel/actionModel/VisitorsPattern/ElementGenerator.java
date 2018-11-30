package com.tht.designModel.actionModel.VisitorsPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by thrall on 2018/11/30.
 */
public class ElementGenerator {
    public static List<Element> generate(int num) {
        List<Element> list = new ArrayList<Element>();
        Random rand = new Random();
        while ((num--) > 0) {
            if (rand.nextBoolean()) {
                list.add(new ConcreteClass1());
            } else {
                list.add(new ConcreteClass2());
            }
        }
        return list;
    }

}
