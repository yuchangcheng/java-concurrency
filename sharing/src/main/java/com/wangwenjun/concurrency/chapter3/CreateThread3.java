package com.wangwenjun.concurrency.chapter3;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:45 2019/1/8
 * @Modified By:
 */
public class CreateThread3 {
    private static int counter = 0;

    public static void main(String[] args) {
        try{
            add(0);
        }catch (Error e){
            e.printStackTrace();
            System.out.println(counter);
        }
    }

    private static void add(int i){
        ++counter;
        add(i +1);
    }
}
//StackOverflowError  23098
