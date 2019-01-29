package com.tht.designModel.structureModel.adapterMethod.adapterDemo1;

/**
 * Created by thrall on 2018/11/26.
 * 适配器模式：继承旧类实现新接口
 */
public class PowerAdapter1 extends AC220 implements DC5 {

    @Override
    public int output5V() {
        return super.output220V()/44;
    }

    public static void main(String[] args) {
        PowerAdapter1 dc5 = new PowerAdapter1();
        System.out.println(dc5.output5V());
    }
}
