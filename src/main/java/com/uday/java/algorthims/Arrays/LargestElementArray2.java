package com.uday.java.algorthims.Arrays;

public class LargestElementArray2 {
    public static void main(String[] args) {
        int[] arr={2,5,20,38};
        int n=arr.length;
        int result = findTheLargestElementInTheArray2(arr,n);
        System.out.println(result);
    }

    private static int findTheLargestElementInTheArray2(int[] arr, int n) {
        int i=0;
        for(i=0;i<n;i++){
            boolean flag=true;
            for (int j = 0; j < n; j++) {
                if(arr[i]<arr[j]){
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
