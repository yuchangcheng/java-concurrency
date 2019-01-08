package com.wangwenjun.concurrency.chapter2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:53 2019/1/7
 * @Modified By:
 */
public class TicketWindow extends Thread{
    private final String name ;

    private static final int MAX = 50;

    private static int index = 1;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(index <= MAX){
            System.out.println("柜台--"+name+"--当前的号码是"+(index++));
        }
    }
}
