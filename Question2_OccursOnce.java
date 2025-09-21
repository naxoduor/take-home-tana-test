package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2_OccursOnce {
    public static void main(String[] args) {
        List<String> products = List.of("Apple", "Computer", "Apple", "Bag" );
        Map<String, Integer> productsFrequency = getItemFrequency(products);
        System.out.println(getFirstItem(productsFrequency, products));
    }

    public static Map<String, Integer> getItemFrequency(List<String> products){
        Map<String, Integer> productFrequency = new HashMap<>();
        for(String product : products){
            if(productFrequency.containsKey(product)) productFrequency.put(product, productFrequency.get(product)+1);
            else productFrequency.put(product, 1);
        }
        return productFrequency;
    }

    public static String getFirstItem(Map<String, Integer> productFrequency, List<String> products) {
        String result = null;
        for(String product : products){
            if(productFrequency.get(product) == 1) return product;
        }
        return result;
    }
}
