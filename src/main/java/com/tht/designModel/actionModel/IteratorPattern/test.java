package com.tht.designModel.actionModel.IteratorPattern;

/**
 * Created by thrall on 2018/11/30.
 * 迭代模式
 * 目的是创建一个迭代
 */
public class test {
    public void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
    public static void main(String[] args) {
        test client = new test();
        client.operation();
    }


}
