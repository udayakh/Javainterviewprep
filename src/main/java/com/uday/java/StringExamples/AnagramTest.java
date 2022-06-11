package com.uday.java.StringExamples;

import java.util.HashMap;
import java.util.Map;

public class AnagramTest {
    public static void main(String[] args) {
        System.out.println(isAnagram("Mary","Army"));
    }

    private static boolean isAnagram(String input1, String input2) {
        Map<Character,Integer> mapOne= calculateChars(input1);
        Map<Character,Integer> mapTwo= calculateChars(input2);
        return mapOne.equals(mapTwo);
    }

    private static Map<Character, Integer> calculateChars(String input1) {
       Map<Character,Integer> placeholderMap=new HashMap<>();
        for (char currentChar: input1.toUpperCase().toCharArray()){
            placeholderMap.putIfAbsent(currentChar,0);
            placeholderMap.computeIfPresent(currentChar,(key,value)->value+1);
        }
        return placeholderMap;
    }

}
