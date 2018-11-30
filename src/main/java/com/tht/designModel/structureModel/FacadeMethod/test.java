package com.tht.designModel.structureModel.FacadeMethod;

/**
 * Created by thrall on 2018/11/26.
 * 客户端根本不需要知道子系统内部的实现，或者根本不需要知道子系统内部的构成，
 * 它只需要跟Facade类交互即可。
 * 有些方法是对系统外的，有些方法是系统内部相互交互的使用的。子系统把那些暴露给外部的功能集中到门面中，
 * 这样就可以实现客户端的使用，很好的隐藏了子系统内部的细节。
 */
public class test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.start();
        System.out.println("==============快乐的分割线===================");
        computer.shutdown();
    }
}
