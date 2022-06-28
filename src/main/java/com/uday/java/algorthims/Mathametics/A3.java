package com.uday.java.algorthims.Mathametics;

public class A3 {
    public static void main(String[] args) {
        int c = 2;
        int n = 32;
        for (int i = 2; i<n; i =(int)Math.pow(i,c)) {
            System.out.println(i);
        }
    }
}