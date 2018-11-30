package com.tht.designModel.actionModel.MemoPattern;

/**
 * Created by thrall on 2018/11/30.
 * //一套基于设计模式的代码不依赖数据库可以被带走。
 */
public class GameRole{
    private int vit;
    private int atk;

    public void init(){
        vit=100;
        atk=100;
    }

    public void show(){
        System.out.println("体力:"+vit);
        System.out.println("攻击力:"+atk);
    }

    public void fightBoss(){
        this.vit=0;
        this.atk=0;
    }

    public RoleStateMemento saveMemento(){
        return (new RoleStateMemento(vit, atk));
    }

    public void recove(RoleStateMemento roleStateMemento){
        this.vit=roleStateMemento.getVit();
        this.atk=roleStateMemento.getAtk();
    }

}
