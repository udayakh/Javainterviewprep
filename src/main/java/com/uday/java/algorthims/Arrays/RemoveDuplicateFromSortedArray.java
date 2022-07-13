package com.uday.java.algorthims.Arrays;
//Naive solution
//time complexity Teta(n)
//space complexity Teta(n)
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int array[] = {10,20,20,30,30,30};
        int modifiedArraySize = remDups(array);
        System.out.println(modifiedArraySize);
    }

    static int remDups(int arr[])
    {
        int n=arr.length;
        int temp[] = new int[n];

        temp[0] = arr[0];

        int res = 1;

        for(int i = 1; i < n; i++)
        {
            if(temp[res - 1] != arr[i])
            {
                temp[res] = arr[i];
                res++;
            }
        }

        for(int i = 0; i < res; i++)
        {
            arr[i] = temp[i];
        }

        return res;
    }
}
