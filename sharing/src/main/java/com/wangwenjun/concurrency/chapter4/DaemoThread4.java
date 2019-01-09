package com.wangwenjun.concurrency.chapter4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:46 2019/1/8
 * @Modified By:
 */
public class DaemoThread4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("2次线程名称--开始："+ Thread.currentThread().getName());
            Thread innerThread = new Thread(() -> {
                try {
                    System.out.println("3里层线程名称--开始：" + Thread.currentThread().getName());
                    Thread.sleep(100_000);
                    System.out.println("3里层线程名称--结束：" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            innerThread.setDaemon(true);
            innerThread.start();
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2次线程名称--结束："+ Thread.currentThread().getName());
        });
//        thread.setDaemon(true);
        thread.start();
        System.out.println("1主线程名称："+ Thread.currentThread().getName());
    }
}
