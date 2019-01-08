package com.wangwenjun.concurrency.chapter2;

/**
 * @Author: yuchangcheng
 * @Description:
 * @Date: Create in 17:46 2019/1/7
 * @Modified By:
 */
public class TaxCalaculator {
    private final double salary;
    private final double bonus;
    private CalaculatorStrategy calaculatorStrategy;

    public TaxCalaculator(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    protected double calcTax(){
        return  calaculatorStrategy.calculate(salary,bonus);
    }

    public double calcuate(){
        return this.calcTax();
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setCalaculatorStrategy(CalaculatorStrategy calaculatorStrategy) {
        this.calaculatorStrategy = calaculatorStrategy;
    }
}
