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
                while(true){
//                    System.out.println("子线程>>"+this.isInterrupted());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println("收到打断信号！");
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        Thread.sleep(100);
        System.out.println("主线程开始1-->"+t.isInterrupted());//"主线程开始1-->"+
        t.interrupt();
        System.out.println("主线程结束2-->"+t.isInterrupted());//"主线程结束2-->"+
    }
}
