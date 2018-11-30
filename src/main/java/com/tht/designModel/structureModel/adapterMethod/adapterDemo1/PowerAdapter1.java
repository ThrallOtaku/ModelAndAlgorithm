package com.tht.designModel.structureModel.adapterMethod.adapterDemo1;

/**
 * Created by thrall on 2018/11/26.
 */
public class PowerAdapter1 extends AC220 implements DC5 {

    @Override
    public int output5V() {
        return super.output220V()/44;
    }

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter1();
        dc5.output5V();
    }
}
