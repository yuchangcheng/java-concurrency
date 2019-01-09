package com.wangwenjun.concurrency.chapter4;

import java.util.Optional;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:32 2019/1/8
 * @Modified By:
 */
public class ThreadSimpleApi2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                Optional.of(Thread.currentThread().getName()+"-Index-"+i).ifPresent(System.out::println);
            }
        });
        thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                Optional.of(Thread.currentThread().getName()+"-Index-"+i).ifPresent(System.out::println);
            }
        });
        thread2.setPriority(Thread.NORM_PRIORITY);

        Thread thread3 = new Thread(()->{
            for(int i=0;i<1000;i++){
                Optional.of(Thread.currentThread().getName()).ifPresent(System.out::println);
            }
        });
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
