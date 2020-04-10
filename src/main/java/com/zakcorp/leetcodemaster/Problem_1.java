package com.zakcorp.leetcodemaster;
import java.util.*;

public class Problem_1 {
    //Only one pair which is equal to target
    public int[] twoSum(int[] arr, int target) {
        if(arr.length == 0)
            return new int[]{0, 0};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(target - arr[i])) {
                return new int[]{map.get(target - arr[i]), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
