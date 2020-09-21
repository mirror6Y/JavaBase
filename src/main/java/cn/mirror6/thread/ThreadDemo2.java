package cn.mirror6.thread;

import java.util.concurrent.*;

/**
 * @Description:
 * @Author: mirror6
 * @Date: 2020/9/21 15:58
 */
public class ThreadDemo2 implements Callable {
    @Override
    public Boolean call() throws Exception {
        for (int i = 20; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + "在抢票" + i);
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadDemo2 t1 = new ThreadDemo2();
        ThreadDemo2 t2 = new ThreadDemo2();
        ThreadDemo2 t3 = new ThreadDemo2();
        //创建服务
        ExecutorService service = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> f1 = service.submit(t1);
        Future<Boolean> f2 = service.submit(t2);
        Future<Boolean> f3 = service.submit(t3);
        //获取结果
        f1.get();
        f2.get();
        f3.get();
        //关闭服务
        service.shutdownNow();
    }
}
