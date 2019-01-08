package com.wangwenjun.concurrency.chapter2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:47 2019/1/7
 * @Modified By:
 */
public class BankVersion2 {
    public static void main(String[] args) {
        final TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable();
        Thread thread1 = new Thread(ticketWindowRunnable,"1号线程");
        Thread thread2 = new Thread(ticketWindowRunnable,"2号线程");
        Thread thread3 = new Thread(ticketWindowRunnable,"3号线程");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
