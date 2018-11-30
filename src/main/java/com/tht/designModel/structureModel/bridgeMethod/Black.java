package com.tht.designModel.structureModel.bridgeMethod;

/**
 * Created by thrall on 2018/11/27.
 */
public class Black implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
