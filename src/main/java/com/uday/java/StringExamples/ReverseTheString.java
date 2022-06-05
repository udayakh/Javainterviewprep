package com.uday.java.StringExamples;

public class ReverseTheString {
    public static void main(String[] args) {
        String input="uday";
        reverseString(input);
    }

    //using String concatnation
    private static void reverseString(String input) {
        final char[] originalArray=input.toCharArray();
        String result = "";
        for (int i = originalArray.length-1; i >=0 ; i--) {
            //append the string for result var
            result+=originalArray[i];
        }
        System.out.println(result);
    }

}
