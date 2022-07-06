package com.uday.java.algorthims.Arrays.selfPractice;

public class EfficientSecondLargestNumber {
    public static void main(String[] args) {
        int array[]={2,10,15,8,7};
        findSecondLargestElement(array);
    }

    private static void findSecondLargestElement(int[] array) {

        int largest=0;
        int res=-1;
        for (int i = 0; i < array.length; i++) {

            if(array[i]>array[largest]){
                largest=i;
                res=largest;
            } else if(array[i]!=array[largest]){
                if(res == -1 || array[i]>array[res]){
                    res=i;
                }
            }
        }
        System.out.println("res "+res);
    }
}
