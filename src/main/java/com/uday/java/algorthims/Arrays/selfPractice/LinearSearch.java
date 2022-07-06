package com.uday.java.algorthims.Arrays.selfPractice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2,-1,18,48,75,16,12};
        for (int i = 0; i < array.length; i++) {
            if(array[i]==16){
                System.out.println("found it");
                break;
            }
        }
    }
}
