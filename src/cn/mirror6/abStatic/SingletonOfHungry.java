package cn.mirror6.abStatic;

/**
 * @author mirror6
 * @description 单例模式 饿汉式 demo
 * @date 2019/6/26 16:37
 */
class SingletonOfHungry {

    private static SingletonOfHungry singletonOfHungry = new SingletonOfHungry();

    private SingletonOfHungry() {
    }

    static SingletonOfHungry getSingleton() {
        return singletonOfHungry;
    }
}
