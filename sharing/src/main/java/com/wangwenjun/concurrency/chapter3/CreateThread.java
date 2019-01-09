package com.wangwenjun.concurrency.chapter3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:48 2019/1/8
 * @Modified By:
 */
public class CreateThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
        //获取当前threadgroup
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        //获取此时线程组的线程数
        System.out.println(threadGroup.activeCount());
        //获取每个线程
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        for (Thread temp:threads){
            System.out.println(temp);
        }
    }
}
