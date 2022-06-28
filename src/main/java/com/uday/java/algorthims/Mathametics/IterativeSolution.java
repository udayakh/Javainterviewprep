package com.uday.java.algorthims.Mathametics;
//finding number of Digits in a number
public class IterativeSolution {
    public static void main(String[] args) {
        int n=123;
        int count=0;
        while (n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
