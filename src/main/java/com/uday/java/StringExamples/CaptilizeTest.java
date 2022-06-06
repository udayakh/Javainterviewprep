package com.uday.java.StringExamples;

public class CaptilizeTest {
    public static void main(String[] args) {
        System.out.println(captilization1("hi iam udaya kumar"));
    }

    private static String captilization1(String input) {
        char[] chars= input.toCharArray();
        boolean nextCaptilized= true;
        for (int i = 0; i < input.length(); i++) {
            final char currentChar = chars[i];
            if(Character.isWhitespace(currentChar)){
                nextCaptilized=true;
            } else {
                if(nextCaptilized && Character.isLetter(currentChar)){
                    chars[i]=Character.toUpperCase(currentChar);
                    nextCaptilized=false;
                }
            }
        }
        return new String(chars);
    }
}
