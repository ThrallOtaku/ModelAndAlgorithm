package com.tht.designModel.actionModel.CommandPattern;

/**
 * Created by thrall on 2018/11/30.
 * 命令模式，就相当于遥控器控制电视和空调
 *请求着-遥控器-接收者action
 */
public class test {
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }
}
