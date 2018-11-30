package com.tht.designModel.structureModel.adapterMethod.adapterDemo1;

/**
 * Created by thrall on 2018/11/26.
 */
public class PowerAdapter2 implements DC5 {
    private AC220 ac220;

    public PowerAdapter2(AC220 ac220){
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int output = 0;
        if (ac220 != null) {
            output = ac220.output220V() / 44;
        }
        return output;
    }

    public static void main(String[] args) {
       PowerAdapter2 adapter = new PowerAdapter2(new AC220());
       adapter.output5V();
    }
}
