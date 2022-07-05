package com.uday.java.algorthims.Arrays.selfPractice;

public class FindLargesElementArray2 {
    public static void main(String[] args) {
        int array[]={2,10,15,8,7};
        findLargestElementArray2(array);
    }

    private static void findLargestElementArray2(int[] array) {
        int res=0;
        int i =0;
        for (i = 0; i < array.length; i++) {
            if(array[i]>array[res]){
                res=i;
            }
        }
        System.out.println(res);
    }
}
