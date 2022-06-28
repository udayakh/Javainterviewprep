package com.uday.java.algorthims.Mathametics;

public class Palindrome {
    public static void main(String[] args) {
        int n=789387;
        boolean result = isPal(n);
        System.out.println(result);
    }

    static boolean isPal(int n)
    {
        int rev = 0;

        int temp = n;
        while(temp != 0)
        {
            int ld = temp % 10;

            rev = rev * 10 + ld;

            temp = temp / 10;
        }

        return rev==n;
    }

}
