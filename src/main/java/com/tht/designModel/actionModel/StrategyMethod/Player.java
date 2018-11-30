package com.tht.designModel.actionModel.StrategyMethod;

/**
 * Created by thrall on 2018/11/27.
 * 策略模式：解开了不同会员等级不同的折扣问题
 * Strategy与Template Method模式之间的区别,也是在"变化的是什么"这个问题上了
 *  Strategy
 */
public class Player {
    private Double totalAmount = 0D;//客户在鹅厂消费的总额
    private Double amount = 0D;//客户单次消费金额
    private CalPrice calPrice = new Orgnic();//每个客户都有一个计算价格的策略，初始都是普通计算，即原价

    //客户购买皮肤，就会增加它的总额
    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        if (totalAmount > 30000) {//30000则改为金牌会员计算方式
            calPrice = new GoldVIP();
        } else if (totalAmount > 20000) {//类似
            calPrice = new SuperVIP();
        } else if (totalAmount > 10000) {//类似
            calPrice = new VIP();
        }
    }

    //计算客户最终要付的钱
    public Double calLastAmount() {
        return calPrice.calPrice(amount);
    }

    public static void main(String[] args) {
        Player player=new Player();
        player.buy(5000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
    }



}
