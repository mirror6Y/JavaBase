package cn.mirror6.strategyTest.strategy;

import cn.mirror6.strategyTest.context.Context;

/**
 * @author ai lun
 * @description
 * @create 2022-05-16 7:57 下午
 */
public class StrategyPattern {

    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
