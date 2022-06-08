package com.uday.java.StringExamples;

public class WellFormedBraces {
    public static void main(String[] args) {
        System.out.println(wellFormedBracesCheck("(())"));
    }

    private static boolean wellFormedBracesCheck(String input) {

        int operation = 0;
        for (int i = 0; i < input.length(); i++) {
            final char brace=input.charAt(i);
            if(brace=='('){
                operation++;
            } else if(brace==')') {
                operation--;
                if(operation<0){
                    return false;
                }
            }
        }
        System.out.println(operation);
        return operation==0;
    }
}
