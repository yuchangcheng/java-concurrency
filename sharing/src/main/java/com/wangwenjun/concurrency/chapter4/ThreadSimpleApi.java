package com.wangwenjun.concurrency.chapter4;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Optional;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:11 2019/1/8
 * @Modified By:
 */
public class ThreadSimpleApi {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            Optional.of("Hello").ifPresent(System.out::print);
            try {
                Thread.sleep(1000_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1");
        Optional.of(thread.getName()).ifPresent(System.out::println);
        Optional.of(thread.getId()).ifPresent(System.out::println);
        Optional.of(thread.getPriority()).ifPresent(System.out::println);
        thread.start();
    }
}
