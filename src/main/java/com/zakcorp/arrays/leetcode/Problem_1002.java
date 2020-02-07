package com.zakcorp.arrays.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_1002 {
    public static void main(String[] args) {
        String[] arr = {"bella","label","roller"};
        List<String> list = commonChars(arr);
        System.out.println(list.toString());
    }

    private static List<String> commonChars(String[] arr) {
        List<String> result = new ArrayList<>();
        int n = arr.length;
        if(n == 0){
            return result;
        }
        Map<Character, Integer> union = new HashMap<>();
        // Considering the first string in the array as the base value for comparison.
        for(int i = 0; i < arr[0].length(); i++) {
            // Shorter form of using the if else condition the check whether key is present or not.
            union.put(arr[0].charAt(i), union.getOrDefault(arr[0].charAt(i), 0)+1);
        }
        for (int i = 1; i < n; i++) {
            Map<Character, Integer> temp = new HashMap<>();
            for (int j = 0; j < arr[i].length(); j++) {
                char curr = arr[i].charAt(j);
                if (union.containsKey(curr) && union.get(curr) > 0) {
                    temp.put(curr, temp.getOrDefault(curr, 0) + 1);
                    union.put(curr, union.get(curr) - 1);
                }
                union = temp;
                if(union.size() == 0){
                    break;
                }
            }
        }
        for(char c : union.keySet()){
            for(int i = 0; i < union.get(c); i++){
                result.add(c + "");
            }
        }
        return result;
    }
}
