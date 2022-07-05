package com.uday.java.algorthims.Arrays;

import java.util.Arrays;

//insert the element in the array
public class ArrayTest2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 5; arr[1] = 10; arr[2] = 20;
        int n= 3;
        int position = 2;
        int capacity=5;
        int element =19;
        int result = insertTheElementInTheTargetedposition(arr,n,position,capacity,element);
        for (int i = 0; i < result; i++) {
            System.out.println(arr[i]);
        }

    }

    private static int insertTheElementInTheTargetedposition(int[] arr, int n, int position, int capacity, int element) {
        if(n==capacity){
            return n;
        }
        int index = position-1;
        for (int i = n-1; i >=index; i--) {
            arr[i+1]=arr[i];
        }
        arr[index]=element;

        Arrays.stream(arr).forEach(System.out::println);

        return n+1;
    }


}
