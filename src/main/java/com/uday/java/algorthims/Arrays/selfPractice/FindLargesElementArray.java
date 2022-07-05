package com.uday.java.algorthims.Arrays.selfPractice;

public class FindLargesElementArray {
    public static void main(String[] args) {
        int array[]={2,10,15,8,7};
        findLargestElementArray(array);
    }

    private static void findLargestElementArray(int[] array) {
        int res=0;
        int i =0;
        for (i = 0; i < array.length; i++) {
            boolean flag=true;
            for (int j = 0; j < array.length; j++) {
                if(array[i]<array[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("i "+i);
            }
        }
        System.out.println(res);
    }
}
