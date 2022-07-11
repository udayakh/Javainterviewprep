package com.uday.java.algorthims.Arrays;

//O(n2)
public class ArrayIsSortedNaive {
    public static void main(String[] args) {
        //ascending order array
        int[] array={5, 12, 30, 2, 35};
        boolean result = isSorted(array);
        System.out.println(result);
    }

    static boolean isSorted(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }
}
