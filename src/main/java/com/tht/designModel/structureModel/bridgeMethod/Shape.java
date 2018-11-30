package com.tht.designModel.structureModel.bridgeMethod;

/**
 * Created by thrall on 2018/11/27.
 * 这个抽象类桥接了形状和颜色
 */
public abstract  class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
