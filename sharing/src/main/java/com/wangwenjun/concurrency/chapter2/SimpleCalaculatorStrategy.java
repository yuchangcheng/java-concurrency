package com.wangwenjun.concurrency.chapter2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 19:26 2019/1/7
 * @Modified By:
 */
public class SimpleCalaculatorStrategy implements CalaculatorStrategy {
    @Override
    public double calculate(double salary, double bonus) {
        return salary*0.1 + bonus*0.15;
    }
}
