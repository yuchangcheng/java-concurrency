package com.wangwenjun.concurrency.chapter3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 15:26 2019/1/8
 * @Modified By:
 */
public class CreateThread5 {
    private static int counter = 1;
    public static void main(String[] args) {
        try{
            for(int i=0;i<Integer.MAX_VALUE;i++){
                counter++;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            add(1);
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("创建的线程数---》"+counter);
                        }
                    }

                    private void add(int i) {
                        add(i+1);
                    }
                }).start();
            }}catch (Error r){
            r.printStackTrace();
        }

    }
}
