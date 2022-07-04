package cn.mirror6.strategyTest.context;

import cn.mirror6.strategyTest.strategy.Strategy;

/**
 * @author ai lun
 * @description
 * @create 2022-05-16 7:55 下午
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
