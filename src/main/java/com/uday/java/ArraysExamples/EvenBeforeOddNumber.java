package com.uday.java.ArraysExamples;

import java.util.Arrays;

public class EvenBeforeOddNumber {
    public static void main(String[] args) {
        int[] values= {1,2,3,4,5,6,7,8,9,10};
        evenBeforOddNumber(values);
    }

    private static void evenBeforOddNumber(int[] values) {
        int arraySize=values.length;
        for (int i = 0; i < arraySize; i++) {
            for (int j = i+1; j < arraySize && !isEven(values[i]); j++) {
                swap(values,i,j);
            }
        }
        Arrays.stream(values).forEach(System.out::println);
    }

    private static boolean isEven(int value){
        return value%2==0;
    }

    private static void  swap(int[] values,int i,int j){
        int temp=values[i];
        values[i]=values[j];
        values[j]=temp;
    }


}
