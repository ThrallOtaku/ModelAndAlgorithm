package com.tht.designModel.actionModel.ObserverPattern;

/**
 * Created by thrall on 2018/11/30.
 * 观察者模式 也叫订阅模式
 * 设计模式其实是没有数据库的情况下的逻辑交互？
 * 解决多种对象跟踪一个对象数据变化的程序结构问题
 * 其实记住这个老师学生模式\provider、consumer 模式就可以搬运一下这个模式
 */
public class test {
    public static void main(String[] args) {
        TeacherSubject teacher=new TeacherSubject();
        StudentObserver zhangSan=new StudentObserver("张三", teacher);
        StudentObserver LiSi=new StudentObserver("李四", teacher);
        StudentObserver WangWu=new StudentObserver("王五", teacher);

        teacher.setHomework("第二页第六题");
        teacher.setHomework("第三页第七题");
        teacher.setHomework("第五页第八题");
    }

}
