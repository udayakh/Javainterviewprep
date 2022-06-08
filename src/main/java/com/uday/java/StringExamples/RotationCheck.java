package com.uday.java.StringExamples;

public class RotationCheck {
    public static void main(String[] args) {
        System.out.println(rotationcheck("ABCD","CD"));
    }

    private static boolean rotationcheck(String str1, String str2) {
        final String newdoubleString = (str1+str2).toLowerCase();
        return newdoubleString.indexOf(str2.toLowerCase())!=-1;
    }
}
