package com.uday.java.algorthims.Mathametics;

public class PalindromeEx2 {
    public static void main(String[] args) {
        boolean result = isPalindrome(12321);
        System.out.println(result);
    }

    //create one temporary int var, loop should check temp var !=0, inside loop create another temp variable caled ld.
    private static boolean isPalindrome(int n) {
        int temp=n;
        int rev=0;
        while (temp!=0){
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        return n==rev;
    }
}
