package com.uday.java.StringExamples;

import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class CheckNoDuplicateChars {
    public static void main(String[] args) {
        System.out.println(checkNoDuplicateChars("uday"));
        System.out.println(checkNoDuplicateChars2("uday"));
        System.out.println(checkNoDuplicateChars3("uday"));
        System.out.println(checkNoDuplicateChars4("uday"));
    }

    //plain java
    private static boolean checkNoDuplicateChars4(String input) {
        final char[] chars=input.toCharArray();
        String duplicate = "";
        for (int i=0;i<chars.length;i++){
           if(duplicate.contains(String.valueOf(chars[i]))){
               return false;
           }
           duplicate+=chars[i];

        }
        return true;

    }

    //option 2: java 8 functionality
    private static boolean checkNoDuplicateChars3(String input) {
        return input.toLowerCase()
                .chars()
                .distinct()
                .count() == input.length();
    }

    //option 1: java 8 functionality
    private static boolean checkNoDuplicateChars2(String input) {
        return input.toLowerCase()
                .chars()
                .boxed()
                .collect(toSet())
                .size()==input.length();
    }

    //using collection Set
    private static boolean checkNoDuplicateChars(String input) {
        final char[] chars=input.toCharArray();
        Set<Character> characters=new HashSet<>();
        for (char ch:characters){
            if(characters.contains(ch)){
                return false;
            }
            characters.add(ch);
        }
        return true;
    }
}
