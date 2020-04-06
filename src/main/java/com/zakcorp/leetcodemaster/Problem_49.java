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
}
