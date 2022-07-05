package com.uday.java.algorthims.Arrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr={2,5,20,38};
        int result = findTheLargestElementInTheArray(arr,arr.length);
        System.out.println(result);
    }

    private static int findTheLargestElementInTheArray(int[] arr, int n) {
        int i;
        for (i = 0; i < n; i++) {
            boolean flag=true;
           for (int j=0;j<n;j++){
               if(arr[j]>arr[i]){
                   flag=false;
                   break;
               }
           }
            if(flag==true){
                return i;
            }
        }

        return -1;
    }

}
