package com.wangwenjun.concurrency.chapter3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:57 2019/1/8
 * @Modified By:
 */
public class CreateThread4 {
    private static int counter = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(null,new Runnable() {
            @Override
            public void run() {
                try{
                    add(1);
                }catch (Error e){
                    e.printStackTrace();
                    System.out.println("----------"+counter);
                }
            }

            private void add(int i){
                ++counter;
                add(i+1);
            }
        },"Test",1<<24);

        t1.start();

    }
}
