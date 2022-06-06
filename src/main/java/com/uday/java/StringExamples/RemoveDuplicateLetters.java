package com.uday.java.StringExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("bananas"));
        System.out.println(removeDuplicateLetters2("bananas"));
    }

    //using java8
    private static String removeDuplicateLetters2(String input) {
        return input
                .chars()
                .distinct()
                .mapToObj(c->(char)c+"")
                .collect(Collectors.joining());
    }

    //using java collection set
    private static String removeDuplicateLetters(String input) {
        char[] chars= input.toCharArray();
        String result="";
        Set<Character> set= new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            final char current = chars[i];
            if(!set.contains(current)){
                result+=current;
            }
            set.add(current);
        }
        return result;
    }

}
