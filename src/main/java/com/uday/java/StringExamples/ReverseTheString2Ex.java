package com.uday.java.StringExamples;
//using String concatnation is expensive, we can do like below way for better optimazation
public class ReverseTheString2Ex {
    public static void main(String[] args) {
        String str="uday";
        revereseTheString(str);

    }

    private static void revereseTheString(String str) {
        final char[] originalArray=str.toCharArray();
        int left=0;
        int right=originalArray.length-1;
        while (left<right){
            //get the left and right chars
            char leftChar= originalArray[left];
            char rightChar= originalArray[right];

             //swap
            originalArray[right]=leftChar;
            originalArray[left]=rightChar;

            left++;
            right--;
        }
        System.out.println(String.valueOf(originalArray));

    }
}
