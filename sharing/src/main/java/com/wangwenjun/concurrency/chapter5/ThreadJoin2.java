package com.wangwenjun.concurrency.chapter5;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 10:52 2019/1/9
 * @Modified By:
 */
public class ThreadJoin2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            try {
                System.out.println("t1---->开始");
                int i = 0;
                while (i<10000){
                    System.out.println("子线程--》"+(++i));
                }
                System.out.println("t1---->结束");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t1.join(1);

        Optional.of("main线程等待子线程在1里面完成自己(子线程)的事情，1之后无论子线程有没完成，开始执行main线程的事情，最后执行子线程的事情").ifPresent(System.out::println);
        IntStream.range(1,1000).forEach(i->System.out.println(Thread.currentThread().getName()+"->"+i));


    }
}
