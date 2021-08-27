package cn.mirror6.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ai lun
 * @description
 * @create 2021-08-27 9:56 上午
 */
public class CommonThreadPoolUtils {


    // CPU 密集型任务(N+1)
    private static final Integer CPU_CORE_POOL_SIZE = 3;
    //I/O 密集型任务(2N)
    private static final Integer IO_CORE_POOL_SIZE = 4;
    private static final Integer MAX_POOL_SIZE = 10;
    private static final Integer QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    /**
     * 处理手动导入的淘宝订单匹配的线程
     */
    public static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            CPU_CORE_POOL_SIZE,
            MAX_POOL_SIZE,
            KEEP_ALIVE_TIME,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(QUEUE_CAPACITY),
            new ThreadPoolExecutor.CallerRunsPolicy());

    /**
     * 处理自动导入的淘宝订单匹配的线程
     */
    public static final ThreadPoolExecutor handleTbOrderAutoExecutor = new ThreadPoolExecutor(
            IO_CORE_POOL_SIZE,
            MAX_POOL_SIZE,
            KEEP_ALIVE_TIME,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(QUEUE_CAPACITY),
            new ThreadPoolExecutor.CallerRunsPolicy());
}

