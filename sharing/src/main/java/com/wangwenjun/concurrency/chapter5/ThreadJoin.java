package com.wangwenjun.concurrency.chapter5;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 10:30 2019/1/9
 * @Modified By:
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));
        });
        Thread t2 = new Thread(()->{
            IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Optional.of("子线程跑完后才执行main线程！main线程等到子线程t1、t2交替进行完才执行").ifPresent(System.out::println);
        IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));
    }
}
