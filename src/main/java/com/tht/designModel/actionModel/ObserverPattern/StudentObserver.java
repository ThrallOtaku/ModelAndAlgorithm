package com.tht.designModel.actionModel.ObserverPattern;

/**
 * Created by thrall on 2018/11/30.
 * 学生相当于是consumer
 * 多个学生consume 一个provider
 */
public class StudentObserver implements Observer {
    //保存一个Subject的引用,以后如果可以想取消订阅,有了这个引用会比较方便
    private TeacherSubject t;
    //学生的姓名,用来标识不同的学生对象
    private String name;
    //构造器用来注册观察者，注册观察者的时候在老师的observer列表里面加入
    public StudentObserver(String name,TeacherSubject t) {
        this.name=name;
        this.t = t;
        //每新建一个学生对象,默认添加到观察者的行列
        t.addObserver(this);
    }

    @Override
    public void update(String info) {
        System.out.println(name+"得到作业:"+info);
    }
}
