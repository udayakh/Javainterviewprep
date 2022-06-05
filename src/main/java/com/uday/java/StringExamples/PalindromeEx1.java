package com.uday.java.StringExamples;

public class PalindromeEx1 {
    public static void main(String[] args) {
        String str="uddu";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String input) {
        final char[] originalChars=input.toCharArray();
        int left=0;
        int right=originalChars.length-1;
        boolean sameValue=true;
        while (left<right&&sameValue){
            sameValue=(originalChars[left]==originalChars[right]);
            left++;
            right--;
        }

        return sameValue;
    }
}
