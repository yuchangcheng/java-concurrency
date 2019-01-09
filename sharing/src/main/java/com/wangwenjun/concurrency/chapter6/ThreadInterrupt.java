package com.wangwenjun.concurrency.chapter6;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:53 2019/1/9
 * @Modified By:
 */
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };
        t.start();
        Thread.sleep(100);
        System.out.println(t.isInterrupted());
        t.interrupt();
        System.out.println(t.isInterrupted());
    }
}
