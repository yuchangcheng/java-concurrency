package com.wangwenjun.concurrency.chapter1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 11:57 2019/1/7
 * @Modified By:
 */
public class TryConcurrency {
    public static void main(String[] args) {
        new Thread("READ-Thread"){
            @Override
            public void run() {
                println(Thread.currentThread().getName());
                readFromDataBase();
            }
        }.start();

        new Thread("WRITE-Thread"){
            @Override
            public void run() {
                writeDataToFile();
            }
        }.start();
    }

    private static void readFromDataBase(){
        try {
            println("开始读取数据库");
            Thread.sleep(1000*10L);
            println("1数据库--花费了10s钟的时间");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("读取数据完成！");
    }

    private static void writeDataToFile(){
        try {
            println("开始向文件写数据");
            Thread.sleep(1000*10L);
            println("2文件--花费了10s钟的时间");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("写数据完成！");
    }

    private static void println(String message){
        System.out.println(message);
    }
}
