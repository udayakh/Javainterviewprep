package com.uday.java.ArraysExamples;

import java.util.Arrays;

public class EvenBeforeOddNumbe2 {
    public static void main(String[] args) {
        int[] values= {1,2,3,4,5,6,7,8,9,10};
        evenBeforOddNumber(values);
    }

    private static void evenBeforOddNumber(int[] values) {
        int left =0;
        int right=values.length-1;
        while (left<right){
            while (left<values.length && isEven(values[left])){
                left++;
            }
            while (right>=0 && !isEven(values[right])){
                right--;
            }

            if(left<right){
                swap(values,left,right);
                left++;
                right--;
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
