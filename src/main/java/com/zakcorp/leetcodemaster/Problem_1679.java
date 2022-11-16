package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1679
{
    static class Solver {
        public int solve1(int[] arr, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int ans = 0;
            for(int i = 0; i < arr.length; i++) {
                int diff = k - arr[i];
                if(map.getOrDefault( diff, 0 ) > 0) {
                    map.put( diff, map.get( diff ) - 1 );
                    ans++;
                } else {
                    map.put(arr[i], map.getOrDefault( arr[i], 0 ) + 1);
                }
            }
            return ans;
        }
    }
}
