package com.uday.java.algorthims.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=30;
        arr[2]=40;
        System.out.println("before insert ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int n = 3,cap=6,element=20,position=2;
        System.out.println();
        n = insert(arr,n,cap,position,element);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int insert(int[] arr, int n, int cap, int position, int element) {
        if(n==cap){
            return n;
        }
        int index = position-1;
        for (int i = n-1; i>=index; i--) {
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        return n+1;
    }
}
