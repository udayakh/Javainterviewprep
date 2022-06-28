package com.uday.java.algorthims.Mathametics;

import static java.lang.Math.floor;
import static java.lang.Math.log10;

public class Logarithmic {
    public static void main(String[] args) {
            int n=123;
        System.out.println(countDigit(n));
    }
    static int countDigit(int n){
        return (int)floor(log10(n)+1);
    }
}
