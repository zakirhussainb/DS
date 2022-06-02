package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_49 {
    static class Solver {
        public List<List<String>> groupAnagrams(String[] strArr) {
            Map<String, List<String>> map = new HashMap<>();
            // Map Definition
            // Key - sorted string - Value -> List of all anagrams
            for (String s : strArr) {
                String sortedStr = getSorted(s.toCharArray());
                if (!map.containsKey(sortedStr)) {
                    map.put(sortedStr, new ArrayList<>());
                }
                map.get(sortedStr).add(s);
            }
            return new ArrayList<>(map.values());
        }
        public String getSorted(char[] chArr) {
            Arrays.sort(chArr);
            return new String(chArr);
        }
    }
    static class Solver1 {
        /* Similar to the above solution, but here we are going to create hashmap keys in the form
          -> eat - 1e1a1t - 1a1e1t
          -> tea - 1t1e1a - 1a1e1t
          -> ate - 1a1t1e - 1a1e1t
         */
        public List<List<String>> solve1(String[] strArr) {
            Map<String, List<String>> map = new HashMap<>();
            int[] count = new int[26];
            for(String s : strArr) {
                Arrays.fill(count, 0);
                for(char ch : s.toCharArray()) {
                    count[ch - 'a']++;
                }
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < 26; i++) {
                    if(count[i] != 0) {
                        sb.append(count[i]);
                        sb.append((char) ('a' + i));
                    }
                }
                String key = sb.toString();
                if(!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(s);
            }
            return new ArrayList<>(map.values());
        }
    }
}
