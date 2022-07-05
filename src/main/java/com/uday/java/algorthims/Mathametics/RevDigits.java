package com.uday.java.algorthims.Mathametics;

public class RevDigits {
    public static void main(String[] args) {
        int n=123;
        int results = reverseDigits(n);
        System.out.println(results);
    }

    private static int reverseDigits(final int n) {
        int temp = n;
        int reverse =0;
        while (temp !=0){
            int remainder = temp%10;
            reverse = reverse*10+remainder;
            temp = temp/10;
        }
        return reverse;
    }
}
