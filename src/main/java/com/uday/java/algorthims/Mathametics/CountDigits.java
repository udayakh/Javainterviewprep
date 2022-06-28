package com.uday.java.algorthims.Mathametics;

public class CountDigits {
    public static void main(String[] args) {
        int n=1234;
        int count=0;
        while (n>0){
            n=n/10;
            System.out.println("n value "+n);
            count++;
        }
        System.out.println(count);
    }
}
