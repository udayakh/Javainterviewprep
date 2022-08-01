package com.uday.java.StringExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesdy"));
        //below code will cause the concurrentmodificationexception
        /*for(String str:list){
            if(str.contains("Monday")){
                strings.remove("Tuesday");
            }
        }*/

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Monday")) {
                list.remove(list.indexOf("Tuesday"));
            }
        }

        System.out.println(list);
    }
}
