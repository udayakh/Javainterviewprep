package com.uday.java.algorthims.Arrays;

public class LargestElementArray3OtherWay {
    public static void main(String[] args) {
        int[] arr={2,5,50,38};
        int n=arr.length;
        int result = findTheLargestElementInTheArray2(arr,n);
        System.out.println(result);
    }

    private static int findTheLargestElementInTheArray2(int[] arr, int n) {
        int res=0;
        for (int i = 1; i < n; i++) {
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }


}
