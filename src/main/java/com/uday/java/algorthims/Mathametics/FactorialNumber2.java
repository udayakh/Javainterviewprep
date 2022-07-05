package com.uday.java.algorthims.Mathametics;

public class FactorialNumber2 {
    public static void main(String[] args) {
        int n =5;
        int result  = factorial(n);
        System.out.println("result is "+result);
    }

    private static int factorial(int n) {
        if(n==0){
            return 1;
        }

        return n * factorial(n-1);
    }
}
