package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_5562 {
    static class Solver {
        public int solve1(String str) {
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < str.length(); i++) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
            Integer[] arr = new Integer[map.size()];
            int k = 0;
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                arr[k++] = entry.getValue();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            int count = 0;
            for(int i = 1; i < arr.length;) {
                if(arr[i - 1].equals(arr[i]) && arr[i - 1] != 0) {
                    arr[i] = arr[i] - 1;
                    count++;
                    Arrays.sort(arr, Collections.reverseOrder());
                } else {
                    i++;
                }
            }
            return count;
        }
    }
}
