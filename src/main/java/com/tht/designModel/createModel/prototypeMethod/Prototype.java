package com.tht.designModel.createModel.prototypeMethod;

/**
 * Created by thrall on 2018/11/26.
 * 这个cloneable是深拷贝还是浅拷贝？    基本类型数据，他是会给你重新复制一份新的，但是引用类型的，
 他就不会重新复制份新的
 * 深拷贝和浅拷贝的区别？   基本类型数据，他是会给你重新复制一份新的，但是引用类型的，
 他就不会重新复制份新的,如果是浅拷贝，原对象和引用对象会共享一个引用类型的数据。
 * Object对象中有clone()接口，不实现Cloneable会报CloneNotSupportedException
 * 比如我有一台车，复制我得到我1，我1跟我共用一台车则是浅拷贝
 * 我1单独有一辆车(车1)，那么就是深拷贝。
 */
public class Prototype implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone()   {
        Object object = null;
        try {
            object= super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }finally {
            return object;
        }
    }

    public static void main (String[] args){
        Prototype pro = new Prototype();
        System.out.println(pro);
        Prototype pro1 = (Prototype)pro.clone();
        System.out.println(pro1);
        System.out.println(pro.equals(pro1));
    }
}
