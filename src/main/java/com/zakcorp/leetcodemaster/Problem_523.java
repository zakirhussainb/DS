package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_523 {
    public boolean checkSubarraySum(int[] arr, int k) {
        int currsum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            currsum = currsum + num;
            if (map.containsKey(currsum - k) && map.size() >= 2){
                return true;
            }
            map.put(currsum, map.getOrDefault(currsum, 0) + 1);
        }
        return false;
    }
}
