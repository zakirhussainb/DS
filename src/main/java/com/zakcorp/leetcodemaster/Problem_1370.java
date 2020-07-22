package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1370 {
    static class Solver {
        public String solve1(String str) {
            int n = str.length();
            // Storing sorted keys in ascending order in treeMap takes O(N logN) time complexity.
            // It is always better to initialize a alphabet array for that purpose. Refer:- solve2()
            TreeMap<Character, Integer> treeMap = new TreeMap<>();
            for(int i = 0; i < n; i++) {
                treeMap.put(str.charAt(i), treeMap.getOrDefault(str.charAt(i), 0) + 1);
            }
            StringBuilder sb = new StringBuilder();
            boolean isAscending = true;
            while ( !treeMap.isEmpty() ) {
                // Need to create a new tree-set object every time we try to remove the key from the map,
                // Otherwise ConcurrentModificationException will be thrown.
                for(char ch : isAscending ? new TreeSet<>(treeMap.keySet()) : new TreeSet<>(treeMap.descendingKeySet()) ) {
                    sb.append(ch);
                    treeMap.put(ch, treeMap.get(ch) - 1);
                    treeMap.remove(ch, 0);
                }
                isAscending = !isAscending;
            }
            return sb.toString();
        }
        public String solve2(String str) {
            // The time complexity is better when you create an array. The approach is whenever you need a sorted result
            // in ascending order, you can always create an array of alphabets.
            int[] arr = new int[26];
            for(int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            while(sb.length() < str.length()) {
                append(sb, arr, true);
                append(sb, arr, false);
            }
            return sb.toString();
        }

        private void append(StringBuilder sb, int[] arr, boolean isAscending) {
            for(int i = 0; i < 26; i++) {
                int value = isAscending ? i : 25 - i;
                // Decrement the value of the key whenever you append that key into the StringBuilder.
                if(arr[value] --> 0) {
                    sb.append( (char)(value + 'a') );
                }
            }
        }
    }
}
