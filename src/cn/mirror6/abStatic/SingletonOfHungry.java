package cn.mirror6.abStatic;

/**
 * @author mirror6
 * @description 单例模式 饿汉式 demo
 * @date 2019/6/26 16:37
 */
public class SingletonOfHungry {

    private static SingletonOfHungry singletonOfHungry = null;

    private SingletonOfHungry() {
    }

    public SingletonOfHungry getSingleton() {
        if (null == singletonOfHungry) {
            singletonOfHungry = new SingletonOfHungry();
        }
        return singletonOfHungry;
    }
}
