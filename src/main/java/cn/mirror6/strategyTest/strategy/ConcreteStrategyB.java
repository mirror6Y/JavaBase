package cn.mirror6.strategyTest.strategy;

import cn.mirror6.strategyTest.strategy.Strategy;

/**
 * @author ai lun
 * @description
 * @create 2022-05-16 7:51 下午
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
