package com.tht.designModel.structureModel.bridgeMethod;

/**
 * Created by thrall on 2018/11/27.
 * 颜色和形状两个维度的桥接
 */
public class test {
    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();
    }
}
