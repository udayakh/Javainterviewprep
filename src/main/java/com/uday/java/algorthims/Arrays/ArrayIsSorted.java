package com.uday.java.algorthims.Arrays;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] array={8,12,15};
        boolean isAscSorted=true;
        int previous=0;
        int next =1;
        for (previous = 0; previous < array.length; previous++) {
            if(array.length == next){
                break;
            }
           if(array[previous]<array[next]){
                isAscSorted=true;
                next++;
               continue;
            } else {
               isAscSorted=false;
               break;

           }
        }
        System.out.println(isAscSorted==true?"yes":"no");
    }
}
