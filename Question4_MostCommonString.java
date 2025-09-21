package org.example;

import java.util.*;

public class Question4_MostCommonString {
    public static void main(String[] args){
        String sentence = "hi there care to discuss algorithm basis or how to solve algorithm or";
        Map<String, Integer> wordCount = getFrequency(sentence);
        System.out.println(getCommonStrings(wordCount));
    }

    public static Map<String, Integer> getFrequency(String sentence){
        String[] words = sentence.trim().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : words){
            if(wordCount.containsKey(word)) wordCount.put(word, wordCount.get(word)+1);
            else wordCount.put(word, 1);
        }
        return wordCount;
    }

    public static List<String> getCommonStrings(Map<String, Integer> wordCount){
        int max = 0;
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            int value = entry.getValue();
            if(value>max) max=value;
        }

        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(value == max) result.add(key);
        }
        result.sort(null);
        return result;
    }
}
