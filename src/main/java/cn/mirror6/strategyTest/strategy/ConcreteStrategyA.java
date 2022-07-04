package cn.mirror6.strategyTest.strategy;

import cn.mirror6.strategyTest.strategy.Strategy;

/**
 * @author ai lun
 * @description
 * @create 2022-05-16 7:50 下午
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
