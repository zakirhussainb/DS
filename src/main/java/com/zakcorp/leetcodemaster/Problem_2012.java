package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2012
{
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int sum = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 1; i <= n - 2; i++) {
                for(int j = 0; j < i; j++) {
                    for(int k = i + 1; k <= n - 1; k++) {
                        if(arr[j] < arr[i] && arr[i] < arr[k]) {
                            map.put(i, 2);
                        } else {
                            map.put(i, 0);
                        }
                    }
                }
            }
            for(int i = 1; i <= n - 2; i++) {
                if(map.containsKey( i )) {
                    if(map.get( i ) == 0) {
                        if(arr[i - 1] < arr[i] && arr[i] < arr[i + 1]) {
                            map.put(i, 1);
                        } else {
                            map.put(i, 0);
                        }
                    }
                }
            }
            return map.values().stream().mapToInt( Integer::intValue ).sum();
        }
    }
}
