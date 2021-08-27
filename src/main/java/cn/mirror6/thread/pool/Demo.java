package cn.mirror6.thread.pool;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author ai lun
 * @description
 * @create 2021-08-27 10:21 上午
 */
@Slf4j
public class Demo {

    public static void main(String[] args) {
        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5, 6);

        integers.forEach(i -> {
            CommonThreadPoolUtils.threadPoolExecutor.submit(() -> {
                log.info("线程池里面的name:{}", Thread.currentThread().getId());
                LocalDateTime beginTime = LocalDateTime.now();
                log.info("ex:{}", i);
                Long execTime = Duration.between(beginTime, LocalDateTime.now()).toMillis();
                log.info("duration:{} ms", execTime);
            });
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("线程池外面的name:{}", Thread.currentThread().getId());
            log.info("--------------------------------:{}", i);
        });
    }
}
