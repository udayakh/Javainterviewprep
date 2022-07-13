package com.uday.java.algorthims.Arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int array[]={10,5,7,30};

        int[] result = reverse(array);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] reverse(int[] array) {
        int n=array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        return array;
    }
}
