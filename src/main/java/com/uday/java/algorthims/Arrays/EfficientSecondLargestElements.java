package com.uday.java.algorthims.Arrays;

public class EfficientSecondLargestElements {
    public static void main(String[] args) {
        int arr[] =  {5,20,12,20,10};
        int n=arr.length;
        System.out.println("before array ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
        int pos=secondlargest(arr);
        System.out.println(pos);
    }

    private static int secondlargest(int[] arr) {
        int largest =0;
        int res=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            } else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }


}
