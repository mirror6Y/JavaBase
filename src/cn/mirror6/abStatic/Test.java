package cn.mirror6.abStatic;

/**
 * @auther mirror6
 * @date 2019/7/8 21:49
 */

public class Test {

    public static void main(String[] args) {
        SingletonOfLazy singletonOfLazy = SingletonOfLazy.getSingleton();
        SingletonOfLazy singleton = SingletonOfLazy.getSingleton();
        System.out.println(singletonOfLazy == singleton);
        SingletonOfHungry singletonOfHungry = SingletonOfHungry.getSingleton();
        SingletonOfHungry ofHungry = SingletonOfHungry.getSingleton();
        System.out.println(singletonOfHungry == ofHungry);
    }
}
