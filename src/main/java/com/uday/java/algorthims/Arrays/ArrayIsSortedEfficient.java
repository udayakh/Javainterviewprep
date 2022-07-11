package com.uday.java.algorthims.Arrays;

//O(n2)
public class ArrayIsSortedEfficient {
    public static void main(String[] args) {
        //ascending order array
        int[] array={5, 12,2, 30, 35};
        boolean result = isSorted(array);
        System.out.println(result);
    }

    static boolean isSorted(int arr[])
    {
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            if(arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }
}
