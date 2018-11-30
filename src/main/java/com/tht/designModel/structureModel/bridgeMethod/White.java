package com.tht.designModel.structureModel.bridgeMethod;

/**
 * Created by thrall on 2018/11/27.
 */
public class White implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
