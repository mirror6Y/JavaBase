package cn.mirror6.thread;

/**
 * @Description:
 * @Author: mirror6
 * @Date: 2020/9/21 15:31
 */
public class ThreadDemo1 implements Runnable {
    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + "在抢票" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo1 demo1 = new ThreadDemo1();
        Thread thread = new Thread(demo1, "1号");
        Thread thread2 = new Thread(demo1, "2号");
        thread.start();
        thread2.start();
    }
}
