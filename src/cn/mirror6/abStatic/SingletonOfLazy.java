package cn.mirror6.abStatic;

/**
 * @author mirror6
 * @description 单例模式 懒汉式 demo
 * @date 2019/6/26 16:21
 */
public class SingletonOfLazy {

    //声明一个Singleton对象
    //如果不在本类中声明，那么就需要在其他类中进行声明，无法保证唯一性
    private static SingletonOfLazy singleton = new SingletonOfLazy();

    //确保实例的唯一性，外界无法直接创建这个类型的对象，只能通过该类提供的方法来获取类的对象
    private SingletonOfLazy() {
    }

    //对外部开放，返回单例对象
    public static SingletonOfLazy getSingleton() {
        return singleton;
    }
}
