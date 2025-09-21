package org.example;

import java.util.ArrayList;
import java.util.List;

public class Question5_RotateList {
    public static void main(String[] args){
        List<String> str = List.of("ID_A01","ID_A02","ID_A03","ID_A04","ID_A05","ID_A06","null");
        rotateList(str, 2);
    }

    public static void rotateList(List<String> str, int n){
        List<String> result = new ArrayList<>();
        for(String word : str){
            result.add("none");
        }
        for(int i = 0; i < str.size(); i++){
            int x=i+n;
            int y = x%(str.size());
            result.set(y, str.get(i));
        }
        System.out.println(result);
    }
}
