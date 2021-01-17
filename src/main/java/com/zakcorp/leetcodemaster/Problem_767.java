package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_767 {
    static class Solver {
        public String solve1(String str) {
            int n = str.length();
            char[] resCh = new char[n];
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < str.length(); i++) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
            final Map<Character, Integer> sortedByValueMap = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new ));

            int j = 0;
            for(Map.Entry<Character, Integer> entry : sortedByValueMap.entrySet()) {
                if(j >= n) {
                    j = j % n;
                    if(j == 0)
                        j = 1;
                }
                int size = entry.getValue();
                while(size > 0) {
                    for(; j < n; ) {
                        if(size > 0) {
                            if(resCh[j] == '\u0000') {
                                resCh[j] = entry.getKey();
                            }
                        }
                        j = j + 2;
                        size--;
                    }
                }
            }
            for(char ch : resCh) {
                if(ch == '\u0000') {
                    return "";
                }
            }
            return new String(resCh);
        }
    }
}
