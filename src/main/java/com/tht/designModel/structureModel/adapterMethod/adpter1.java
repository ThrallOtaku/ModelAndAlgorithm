package com.tht.designModel.structureModel.adapterMethod;

/**
 * Created by thrall on 2018/11/26.
 * 类适配：创建新类，继承源类，并实现新接口，例如
 * 笔记本的电源（也叫电源适配器），是将220V的交流电转换为笔记本电脑所需要的12V（电流先忽略），
 * 笔记本电脑的各种接口，VGA转Hdml，USB-TypeA 转 USB-TypeC
 * 三种适配器模式都可以使用，主要看目标adpter和原adpter了
 */
public class adpter1  extends oldClass  implements newFunc{
    private int age;

    @Override
    public void newFunc() {

    }
}
