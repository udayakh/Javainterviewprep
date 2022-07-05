package com.uday.java.algorthims.Arrays;
//find the targeting element index in the array
public class ArrayTest1 {
    public static void main(String[] args) {
        int arr[] = {10,15,20,30,40};
        int n= arr.length;
        int targerElement = 90;
        int result = findTargetIndex(arr,n,targerElement);
        System.out.println("result = "+result);

    }

    //time complexcity - O(n)
    private static int findTargetIndex(int[] arr, int size, int targerElement) {
        for (int i = 0; i < size; i++) {
            if(arr[i]==targerElement){
                return i;
            }
        }
        return -1;
    }
}
