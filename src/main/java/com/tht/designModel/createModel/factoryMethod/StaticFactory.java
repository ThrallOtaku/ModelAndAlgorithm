package com.tht.designModel.createModel.factoryMethod;

/**
 * Created by thrall on 2018/11/23
 * 常用用的工厂模式是静态工厂，利用static方法，
 * 作为一种类似于常见的工具类Utils等辅助效果，一般情况下工厂类不需要实例化。
 */
public class StaticFactory {
    private StaticFactory(){}

    public static food getA(){  return new A(); }
    public static food getB(){  return new B(); }
    public static food getC(){  return new C(); }
}
