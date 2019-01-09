package com.wangwenjun.concurrency.chapter4;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:07 2019/1/8
 * @Modified By:
 */
public class DaemoThread {
    public static void main(String[] args) {
       Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("开始---------"+Thread.currentThread().getName());
                    Thread.sleep(1000000);
                    System.out.println("---------结束"+Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
       t.setDaemon(true);
       t.start();
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("#########"+Thread.currentThread().getName());
    }

}
