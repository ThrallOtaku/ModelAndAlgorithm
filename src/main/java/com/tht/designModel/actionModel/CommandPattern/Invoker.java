package com.tht.designModel.actionModel.CommandPattern;

/**
 * Created by thrall on 2018/11/30.
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){
        System.out.println("请求者行动,请求command执行");
        command.execute();
    }

}
