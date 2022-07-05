package com.uday.java.algorthims.Mathametics;

public class PalindromeEx3 {
    public static void main(String[] args) {
        int n=363;
       boolean result = isPalindromeNumber(n);
        System.out.println("result is "+result);
    }

    private static boolean isPalindromeNumber(final int n) {
        int temp = n;
        int rev =0;
        while (temp !=0){
            //get last digit
            final int remainder = temp %10;
                        rev = rev*10+remainder;
                        temp = temp/10;
        }
        return n ==rev;
    }
}
