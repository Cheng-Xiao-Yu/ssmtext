package com.tedu.aop;

import org.springframework.stereotype.Component;

@Component
public class CalculatotImpl implements Calculator{
    @Override
    public int add(int m, int n) {
        System.out.println(m+"+"+n+"="+(m+n));
        return m+n;
    }

    @Override
    public int sub(int m, int n) {
        System.out.println(m+"-"+n+"="+(m-n));
        return m-n;
    }

    @Override
    public int mul(int m, int n) {
        System.out.println(m+"×"+n+"="+(m*n));
        return m*n;
    }

    @Override
    public int div(int m, int n) {
        if (n==0)
            throw new RuntimeException("除数不能为零");
        System.out.println(m+"÷"+n+"="+(m/n));
        return m/n;
    }

    @Override
    public double add(double m, double n) {
        System.out.println(m+"+"+n+"="+(m+n));
        return m+n;
    }

    @Override
    public String add(String m, String n) {
        System.out.println(m+"+"+n+"="+(Double.parseDouble(m)+Double.parseDouble(n)));
        return String.valueOf(Double.parseDouble(m)+Double.parseDouble(n));
    }
}
