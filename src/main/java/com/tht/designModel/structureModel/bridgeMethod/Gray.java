package com.tht.designModel.structureModel.bridgeMethod;

/**
 * Created by thrall on 2018/11/27.
 */
public class Gray implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
