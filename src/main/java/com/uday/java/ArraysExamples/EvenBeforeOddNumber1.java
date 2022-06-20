package com.uday.java.ArraysExamples;

import java.util.Arrays;

public class EvenBeforeOddNumber1 {
    public static void main(String[] args) {
        int[] values= {1,2,3,4,5,6,7,8,9,10};
        evenBeforOddNumber2(values);
    }

    private static void evenBeforOddNumber2(int[] values) {
        int nextEven=0;
        int nextOdd = values.length-1;
        while (nextEven<nextOdd){
            int currentValue = values[nextEven];
            if(isEven(currentValue)){
                //do nothing
                nextEven++;
            } else{
                swap(values,nextEven,nextOdd);
                nextOdd--;

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
