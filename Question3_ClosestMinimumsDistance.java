package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question3_ClosestMinimumsDistance {
    public static void main(String[] args){
        List<Integer> array = List.of(1,2,3,1,4,5,2);
        int minimum = getMinimum(array);
        System.out.println(getDistance(minimum, array));

    }

    public static int getMinimum(List<Integer> array){
        Map<Integer, Integer> numberMap = new HashMap<>();
        int maxValue=0;
        for(int number : array){
            if(number > maxValue) maxValue = number;
            if(numberMap.containsKey(number)) numberMap.put(number, numberMap.get(number)+1);
            else numberMap.put(number, 1);
        }
        int minimum = maxValue;
        for(Map.Entry<Integer, Integer> entry : numberMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > 1 && key < minimum) minimum = key;
        }
        return minimum;
    }

    public static int getDistance(int minimum, List<Integer>array){
        int distance=array.size();
        int firstIndex = 0;
        for(int i = 0; i<array.size(); i++){
            if(array.get(i) == minimum) {
                firstIndex = i;
                break;
            }
        }

        int previous=firstIndex;
        for(int i = firstIndex+1; i<array.size();i++){
            if(array.get(i) == minimum){
                distance = i - previous;
                previous = i;
            }
        }
        return distance;
    }
}
