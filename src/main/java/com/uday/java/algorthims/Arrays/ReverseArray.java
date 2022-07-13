package com.uday.java.algorthims.Arrays;

import java.util.Arrays;
//time complexity - Tita(N)
//auxiliary space - Tita(1)
public class ReverseArray {
    public static void main(String[] args) {
        int array[]={10,5,7,30};

        int[] result = reverse(array);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] reverse(int[] array) {
        int n=array.length;
        int low=0,high=n-1;
        while (low<high){
            int temp = array[low];
            array[low]=array[high];
            array[high]=temp;
            low++;
            high--;
        }
        return array;
    }
}
