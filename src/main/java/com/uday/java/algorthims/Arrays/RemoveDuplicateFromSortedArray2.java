package com.uday.java.algorthims.Arrays;
//Effective solution
//Time Complexcity - O(n)
//space Complexcity - O(1)
public class RemoveDuplicateFromSortedArray2 {
    public static void main(String[] args) {
        int array[] = {10,20,20,30,30,30};
        int modifiedArraySize = remDups(array);
        System.out.println(modifiedArraySize);
    }

    static int remDups(int arr[])
    {
        int n=arr.length;

        int res = 1;
        for(int i = 0; i < n; i++)
        {
            if(arr[res - 1] != arr[i])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
