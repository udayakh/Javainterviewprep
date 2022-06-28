package com.uday.java.algorthims.Mathametics;

public class PalindromeEx1 {
    public static void main(String[] args) {
        boolean result = isPalindrome(12321);
        System.out.println(result);
    }

    private static boolean isPalindrome(int n) {
     int temp =n;
     int rev=0;
     while (temp!=0){
         int ld = temp%10;
         rev=rev*10+ld;
         temp= temp/10;
     }
     if(rev==n){
         return true;
     } else {
         return false;
     }
    }
}
