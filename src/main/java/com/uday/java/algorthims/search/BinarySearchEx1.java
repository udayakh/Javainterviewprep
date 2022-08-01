package com.uday.java.algorthims.search;

//if you found the target return the index, if not return the -1
//naive approach
public class BinarySearchEx1 {
    public static void main(String[] args) {
        int[] array ={10,20,30,40,50,60};
        int target = 90;
        int result = findTheIndex(array,target);
        System.out.println(result);
    }

    private static int findTheIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
