package com.tht.designModel.createModel.factoryMethod;

import com.tht.designModel.createModel.singletonMethod.Singleton;

/**
 * Created by thrall on 2018/11/23.
 */
public class client {
    public void get(String name){
        food x = null ;
        if (name.equals("A")) {
            x = StaticFactory.getA();
        }else if ( name.equals("B")){
            x = StaticFactory.getB();
        }else {
            x = StaticFactory.getC();
        }

        /**
         * singleton 在外部没法new,所以是singleton
         */
         Singleton.getInstance();

    }
}
