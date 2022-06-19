package com.uday.java.ArraysExamples;

public class FindNumber {
    public static void main(String[] args) {
        int[] values={2,5,4,3,8,6,9};
        int result = findTheTarget(values,5);
        System.out.println(result);
    }

    private static int findTheTarget(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if(values[i]==target){
                return i;
            }
        }
        return -1;
    }
}
