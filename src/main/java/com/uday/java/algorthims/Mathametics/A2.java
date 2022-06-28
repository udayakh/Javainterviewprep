package com.uday.java.algorthims.Mathametics;

public class A2 {
    public static void main(String[] args) {
        int c = 2;
        int n = 32;
        for (int i = n; i > 1; i = i / c) {
            System.out.println(i);
        }
    }
}