package com.uday.java.algorthims.Arrays.selfPractice;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int array[]={2,10,15,8,7};
        int largestIndex= findLargesElementArray(array);
        int res=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=array[largestIndex]){
                if(array[i]>array[res]){
                    res=i;
                }
            }
        }
        System.out.println(res);
    }

    private static int findLargesElementArray(int[] array) {
        int res=0;
        int i =0;
        for (i = 0; i < array.length; i++) {
            if(array[i]>array[res]){
                res=i;
            }
        }
        return res;
    }
}
