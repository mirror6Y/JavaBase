package cn.mirror6.thread;

/**
 * @author mirror6
 * @description
 * @createTime 2020/7/1 11:17
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {

        int count = 20;
        for (; count > 0; count--) {
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo.run();
        threadDemo1.run();
        System.out.println("---");
        threadDemo.start();
        threadDemo1.start();
    }
}
