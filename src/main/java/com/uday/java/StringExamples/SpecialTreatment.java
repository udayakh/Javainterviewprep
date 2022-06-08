package com.uday.java.StringExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialTreatment {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("iam","uday","kumar");
        List<String> ignoringWords=Arrays.asList("uday","kumar");
        specialTreatment(words,ignoringWords);
    }



    //palin java
    private static void specialTreatment(List<String> words, List<String> ignoringWords) {
        List<String> captializedwords= new ArrayList<>();
        for (String word: words){
            if(ignoringWords.contains(word)){
                captializedwords.add(word);
            }else{
                captializedwords.add(captializedword(word));
            }
        }
        System.out.println(captializedwords);
    }

    private static String captializedword(String word) {
        String firstChar=word.substring(0,1).toUpperCase();
        String remainingword=word.substring(1);
        return firstChar+remainingword;
    }
}
