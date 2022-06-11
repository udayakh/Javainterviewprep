package com.uday.java.StringExamples;

import java.util.HashMap;
import java.util.Map;

public class MatchPatterns {
    public static void main(String[] args) {
        System.out.println(matchPattern("xyx","uday teju uday1"));
    }

    private static boolean matchPattern(String pattern, String input) {
        final String[] values = input.split(" ");
        final int patternLength=pattern.length();
        final int valuesLength=values.length;

        if(valuesLength !=patternLength
        || (valuesLength==1 && values[0].isEmpty())){
            return false;
        }

        Map<Character, String> placeholderValueMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            final String value = values[i];
            final char patternChar = pattern.charAt(i);

            placeholderValueMap.putIfAbsent(patternChar, value);
            final String assignedValue = placeholderValueMap.get(patternChar);
            if (!assignedValue.equals(value)) {
                return false;
            }
        }
        return true;
    }
}
