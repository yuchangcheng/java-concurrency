package com.wangwenjun.concurrency.chapter5;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 13:46 2019/1/9
 * @Modified By:
 */
public class ThreadJoin3 {
    public static void main(String[] args) throws InterruptedException {
        long startTimestamp = System.currentTimeMillis();
        Thread t1 = new Thread(new CaptureRunnable("M1",10000L));
        Thread t2 = new Thread(new CaptureRunnable("M2",30000L));
        Thread t3 = new Thread(new CaptureRunnable("M3",15000L));
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        long endTimestamp = System.currentTimeMillis();
        System.out.printf("开始时间：%s,结束时间：%s,花费时间%s\n",startTimestamp,endTimestamp,(endTimestamp-startTimestamp));
    }
}

class CaptureRunnable implements Runnable{
    private String machineName;
    private long spendTime;

    public CaptureRunnable(String machineName,long spendTime){
        this.machineName = machineName;
        this.spendTime = spendTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(spendTime);//采集数据
            System.out.println(machineName+"----采集完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getResult(){
        return machineName + " finis;";
    }
}
