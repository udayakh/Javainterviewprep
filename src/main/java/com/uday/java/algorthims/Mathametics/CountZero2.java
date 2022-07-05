package com.uday.java.algorthims.Mathametics;

public class CountZero2 {
    public static void main(String[] args) {
        int n=10;
        int result = countZeros(n);
        System.out.println(result);
    }

    private static int countZeros(int n) {
        int res=0;
        for (int i = 5; i <= n; i=i*5) {
            res = res+(n/i);
        }
        return res;
    }
}
