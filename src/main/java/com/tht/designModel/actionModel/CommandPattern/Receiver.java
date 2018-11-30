package com.tht.designModel.actionModel.CommandPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class Receiver {
    /**
     * 真正执行命令相应的操作
     */
    public void action(){
        System.out.println("接收者action,我是一个电视机,执行操作");
    }
}
