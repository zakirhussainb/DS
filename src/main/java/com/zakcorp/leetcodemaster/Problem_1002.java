package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1002 {
    static class Solver {
        public List<String> commonChars(String[] arr) {
            List<String> ans = new ArrayList<>();
            if(arr.length == 0)
                return ans;

            Map<Character, Integer> union = new HashMap<>();
            for(int i = 0; i < arr[0].length(); i++) {
                union.put( arr[0].charAt(i), union.getOrDefault(arr[0].charAt(i), 0) + 1 );
            }

            for(int i = 1; i < arr.length; i++) {
                Map<Character, Integer> temp = new HashMap<>();
                for(int j = 0; j < arr[i].length(); j++) {
                    char curr = arr[i].charAt(j);
                    if(union.containsKey(curr)) {
                        temp.put( curr, Math.min( union.get(curr), temp.getOrDefault(curr, 0) + 1 ) );
                    }
                }
                union = temp;
            }
            union.forEach((k, v) -> {
                while(v > 0) {
                    ans.add(k + "");
                    v--;
                }
            });
            return ans;
        }
    }
}
