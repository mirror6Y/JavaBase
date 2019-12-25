package cn.mirror6.abstatic;

/**
 * @author mirror6
 * @description double-checked locking 双检查加锁 优化版单利模式
 * @date 2019/7/15 15:32
 */
public class SingletonOfSafety {

    /**
     * volatile 关键字确保：当singletonOfSafety变量被初始化成Singleton实例时多个线程正确地处理singletonOfSafety变量。
     */
    private volatile static SingletonOfSafety singletonOfSafety = null;

    private SingletonOfSafety() {
    }

    public static SingletonOfSafety getInstance() {
        /*
         * 注意，只有第一次才彻底执行下面的代码块
         */
        if (null == singletonOfSafety) {
            synchronized (SingletonOfSafety.class) {
                /*
                 * 进入区块后，再检查一次。如果仍是null，才创建实例
                 */
                if (null == singletonOfSafety) {
                    singletonOfSafety = new SingletonOfSafety();
                }
            }
        }
        return singletonOfSafety;
    }
}
