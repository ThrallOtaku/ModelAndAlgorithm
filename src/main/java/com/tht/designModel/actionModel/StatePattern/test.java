package com.tht.designModel.actionModel.StatePattern;

/**
 * Created by thrall on 2018/11/30.
 *从上面可以看出，环境类Context的行为request()是委派给某一个具体状态类的。
 * 通过使用多态性原则，可以动态改变环境类Context的属性State的内容，
 * 使其从指向一个具体状态类变换到指向另一个具体状态类，从而使环境类的行为
 * request()由不同的具体状态类来执行。
 */
public class test {
    public static void main(String[] args) {
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }
}
