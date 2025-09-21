package org.example;

import java.util.*;

public class Question1_GetLongestString {
    public static void main(String[] args){
        String chars="ABCD";
        List<String> str=List.of("AABCDA","ABCDZADC","ABCDBCA","ABCDABDCA");
        System.out.println(getLongestString(chars, str));
    }

    public static String getLongestString(String chars, List<String> str){
        Map<Character, Integer> charMap = new HashMap<>();
        int len=0;
        String result = "";
        for(String item : str) {
            if(checkNoRepetition(item) && checkUnique(chars, item)){
                if(item.length()>len){
                    len = item.length();
                    result = item;
                }
            }
        };
        return result;
    }

    public static boolean checkNoRepetition(String word){
        char previous = ' ';
        for(char ch : word.toCharArray()){
            if(previous == ch) return false;
            previous = ch;
        }
        return true;
    }

    public static boolean checkUnique(String chars, String word){
        Set<Character> set = new HashSet<>();
        for(char ch : chars.toCharArray()){
            set.add(ch);
        }
        for(Character chr : word.toCharArray()){
            if(!set.contains(chr)) return false;
        }
        return true;
    }

}
