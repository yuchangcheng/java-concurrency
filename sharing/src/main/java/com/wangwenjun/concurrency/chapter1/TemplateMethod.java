package com.wangwenjun.concurrency.chapter1;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 14:26 2019/1/7
 * @Modified By:
 */
public class TemplateMethod {
    public final void print(String message){
        System.out.println("###############################");
        wrapPrint(message);
        System.out.println("###############################");
    }

    protected void wrapPrint(String message){

    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod(){
            @Override
            protected void wrapPrint(String message){
                System.out.println("*"+message+"*");
           }
        };
        t1.print("Hello Thread");

        TemplateMethod t2 = new TemplateMethod(){
            @Override
            protected void wrapPrint(String message){
                System.out.println("+"+message+"+");
            }
        };
        t2.print("Hello Thread");
    }
}
