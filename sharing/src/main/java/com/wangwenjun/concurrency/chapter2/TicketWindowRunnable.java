package com.wangwenjun.concurrency.chapter2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:40 2019/1/7
 * @Modified By:
 */
public class TicketWindowRunnable implements Runnable {
    private  static int index = 1;
    private final static int MAX = 50;

    @Override
    public void run() {
        while(index <= 50){
            System.out.println(Thread.currentThread().getName() +" 的号码是："+(index++ ));
        }
    }
}
