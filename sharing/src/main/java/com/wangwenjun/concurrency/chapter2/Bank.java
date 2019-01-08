package com.wangwenjun.concurrency.chapter2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 16:23 2019/1/7
 * @Modified By:
 */
public class Bank  {
    public static void main(String[] args) {
        TicketWindow ticketWindow1 = new TicketWindow("1号");
        ticketWindow1.start();

        TicketWindow ticketWindow2 = new TicketWindow("2号");
        ticketWindow2.start();

        TicketWindow ticketWindow3 = new TicketWindow("3号");
        ticketWindow3.start();
    }
}
