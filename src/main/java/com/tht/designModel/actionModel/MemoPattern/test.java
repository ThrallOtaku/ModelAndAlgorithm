package com.tht.designModel.actionModel.MemoPattern;

/**
 * Created by thrall on 2018/11/30.
 * 适合功能比较复杂的，但需要维护或记录属性历史的功能。
 * 流式数据，不需要记录到数据库的数据。不可能所有的游戏细节数据都记录到数据库里面。
 */
public class test {
    public static void main(String[] args) {
        GameRole liaowp=new GameRole();
        liaowp.init();
        liaowp.show();
        RoleStateMange adminMange=new RoleStateMange();
        adminMange.setMemento(liaowp.saveMemento());//保存
        liaowp.fightBoss();
        liaowp.show();
        liaowp.recove(adminMange.getMemento());
        liaowp.show();
    }
}
