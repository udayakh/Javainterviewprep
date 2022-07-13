package com.uday.java.algorthims.Arrays;

import java.util.Arrays;

//move All the zeros to End
public class ArrayTest7 {
    public static void main(String[] args) {
        int arr[]={8,5,0,10,0,20};
        //using temp array
          //moveallzerostoEnd(arr);
        //naive solution O(n2)
         //moveZerosToEnd(arr);
         //effective solution O(n) & O(n)
        moveZerosToEnd2(arr);
    }

    private static void moveZerosToEnd2(int[] arr) {
        int n= arr.length;
        int count=0;
        for (int i = 0; i < n; i++) {

            if(arr[i]!=0) {
             swapArray(arr,i,count);
             count++;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void moveZerosToEnd(int[] arr) {
        int n= arr.length;
        for (int i = 0; i < n; i++) {

            if(arr[i]==0) {
                for (int j = i; j < n; j++) {
                 if(arr[j]!=0){
                     swapArray(arr,i,j);
                 }
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swapArray(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void moveallzerostoEnd(int[] arr) {
    int n=arr.length;
    int temp[]=new int[n];
    int res=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                temp[res]=arr[i];
                res++;
            }
        }
        Arrays.stream(temp).forEach(System.out::println);
    }
}
