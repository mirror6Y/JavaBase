package cn.mirror6.thread;

/**
 * @author mirror6
 * @description
 * @createTime 2020/7/1 11:17
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        for (int i = 2000; i > 0; i--) {
            System.out.println("我在抢票" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo.start();
        threadDemo1.start();
        for (int i = 2000; i > 0; i--) {
            System.out.println("抢" + i);
        }
    }
}
