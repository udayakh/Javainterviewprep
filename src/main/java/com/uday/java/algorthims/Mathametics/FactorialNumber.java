package com.uday.java.algorthims.Mathametics;

public class FactorialNumber {
    public static void main(String[] args) {
        int n =5;
        int result  = factorial(n);
        System.out.println("result is "+result);
    }

    private static int factorial(int n) {
        int res=1;
        for (int i = 2; i <= n; i++) {
            res = i*res;
        }
        return res;
    }
}
