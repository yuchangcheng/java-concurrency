package com.wangwenjun.concurrency.chapter2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:07 2019/1/7
 * @Modified By:
 */
public class TaxCalaculatorMain {
    public static void main(String[] args) {
        /*
        TaxCalaculator taxCalaculator = new TaxCalaculator(10000d,2000d){
            @Override
            protected double calcTax() {
                return getSalary()*0.1+getBonus()*0.15;
            }
        };
        double tax = taxCalaculator.calcuate();
        System.out.println("----------->"+tax);
        */

        TaxCalaculator taxCalaculator = new TaxCalaculator(10000d,2000d);
        CalaculatorStrategy strategy = new SimpleCalaculatorStrategy();
        taxCalaculator.setCalaculatorStrategy(strategy);
        double calcuate = taxCalaculator.calcuate();
        System.out.println(calcuate);
    }
}
