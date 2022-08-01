package com.uday.java.algorthims.search.mypractice;

public class BSearchEx1 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int x=50;
        int elementIndex=bsearch(arr,x);
        System.out.println(elementIndex);
    }

    private static int bsearch(int[] arr, int x) {
        int n=arr.length;
        int high=n-1;
        int low=0;
        while (low<high) {
            int mid = (low+high)/2;
            if(arr[mid]==x){
            return mid;
            } else if(arr[mid]>x){
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return -1;
    }
}
