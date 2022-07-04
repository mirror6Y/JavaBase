package cn.mirror6;

/**
 * @Description:
 * @Author: mirror6
 * @Date: 2020/9/17 1:37
 */
public class Test extends Thread{

    private long count = 0;

    private void add10K() {
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
    }

    @Override
    public void run() {
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
    }

    public long calc() throws InterruptedException {
        final Test test = new Test();
        // 创建两个线程，执行add()操作
        Thread th1 = new Thread();
        Thread th2 = new Thread();
        //启动两个线程
        th1.start();
        th2.start();
        //等待两个线程执行结束
        th1.join();
        th2.join();
        return count;
    }

    int res() {
        try {
            return 1;
        } catch (Exception e) {
            int[] a = new int[0];
            a[1] = 1;
            return 2;
        } finally {
            return 3;
        }
    }

    void print() {
        try {
            System.out.println(1);
        } catch (Exception e) {
            Test test = null;
            test.res();
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
//        test.print();
        System.out.println(test.calc());
//        System.out.println(test.res());
    }
}
