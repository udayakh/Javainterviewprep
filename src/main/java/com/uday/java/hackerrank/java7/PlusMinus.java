package com.uday.java.hackerrank.java7;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, -2, -7, 9, 1, -8, -5));
    // Write your code here

        int n= arr.size();
        float positive=0;
        float negative=0;
        float zeroValue=0;
        for (int i = 0; i < n; i++) {
           int number = arr.get(i);
           if(number>0){
               positive++;
           } else if(number<0){
               negative++;
           } else if(number==0){
               zeroValue++;
           }
        }

        if(positive>0 || positive==0){
            double i2=positive/n;
            BigDecimal x = new BigDecimal(new DecimalFormat("##.######").format(i2));
            x = x.setScale(6);
            System.out.println(x); // 0
        }
        if(negative>0 || negative==0){
            double i2=negative/n;
            BigDecimal x = new BigDecimal(new DecimalFormat("##.######").format(i2));
            x = x.setScale(6);
            System.out.println(x); // 0
        }
        if(zeroValue>0 || zeroValue==0){
            double i2=zeroValue/n;
            BigDecimal x = new BigDecimal(new DecimalFormat("##.######").format(i2));
            x = x.setScale(6);
            System.out.println(x); // 0
        }


    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();*/
        Result.plusMinus();
    }
}
