package cn.mirror6.abstatic;

/**
 * @author mirror6
 * @description 单例模式 饿汉式 demo 线程安全
 * @date 2019/6/26 16:37
 */
public class SingletonOfHungry {

    private static SingletonOfHungry singletonOfHungry = new SingletonOfHungry();

    private SingletonOfHungry() {
    }

    public static SingletonOfHungry getSingleton() {
        return singletonOfHungry;
    }
}
