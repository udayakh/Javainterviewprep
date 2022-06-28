package com.uday.java.algorthims.Mathametics;

public class RecursiveSolution {
    public static void main(String[] args) {
        int n=123;
        System.out.println(recursive(n));
    }

    private static int recursive(int n) {
        int count=0;
        if(n==0){
            return 0;
        } else {
            n=n/10;
            return 1+recursive(n);
        }

    }
}
