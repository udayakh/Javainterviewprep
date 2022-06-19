package com.uday.java.ArraysExamples;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //using collection

        int[] values= {90,70,10,20,30,40,60,20,90,80,30};

        removeDuplicates(values);

    }

    private static void removeDuplicates(int[] values) {
        Set<Integer> integerSet=collectiveValues(values);
        int[] result= convertSetToArray(integerSet);
        Arrays.stream(result).forEach(System.out::println);

    }

    private static int[] convertSetToArray(Set<Integer> integerSet) {
        return integerSet.stream().mapToInt(value -> value).toArray();
    }

    private static Set<Integer> collectiveValues(int[] values) {
        Set<Integer> integerSet=new TreeSet<>();
        for (int i = 0; i < values.length; i++) {
            integerSet.add(values[i]);
        }
        return integerSet;
    }
}
