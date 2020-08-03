package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_953 {
    static class Solver {
        public boolean solve1(String[] words, String order) {
            Map<Character, Integer> hMap = new HashMap<>();
            for(int i = 0; i < order.length(); i++)
                hMap.put(order.charAt(i), i);

            for(int i = 0; i < words.length - 1; i++)
                if( !compare(words[i], words[i + 1], hMap) )
                    return false;
            return true;
        }
        public boolean solve2(String[] words, String order) {
            int[] index = new int[26];
            for(int i = 0; i < order.length(); i++) {
                index[order.charAt(i) - 'a'] = i;
            }
            for(int i = 0; i < words.length - 1; i++)
                if( !compare(words[i], words[i + 1], index) )
                    return false;
            return true;
        }
        private boolean compare(String s1, String s2, Map<Character, Integer> hMap) {
            int l1 = s1.length(); int l2 = s2.length();
            for(int j = 0; j < l1 && j < l2; j++)
                if(s1.charAt(j) != s2.charAt(j))
                    return hMap.get(s1.charAt(j)) <= hMap.get(s2.charAt(j));
            return l1 <= l2;
        }
        private boolean compare(String s1, String s2, int[] index) {
            int l1 = s1.length(); int l2 = s2.length();
            for(int j = 0; j < l1 && j < l2; j++)
                if(s1.charAt(j) != s2.charAt(j))
                    return index[s1.charAt(j) - 'a'] <= index[s2.charAt(j) - 'a'];
            return l1 <= l2;
        }
    }
}
