package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1296
{
    static class Solver1 {
        public boolean solve1(int[] arr, int k) {
            Map<Integer, Integer> map = new TreeMap<>();
            for(int num : arr)
                map.put(num, map.getOrDefault( num, 0 ) + 1);

            for(int x : map.keySet()) {
                if(map.get( x ) > 0) {
                    for(int i = k - 1; i >= 0; i--) {
                        if(map.getOrDefault(x + i, 0 ) < map.get( x ) )
                            return false;
                        map.put(x + i, map.get(x + i) - map.get( x ));
                    }
                }
            }
            return true;
        }
        public boolean solve2(int[] nums, int k) {
            if(nums.length % k != 0)
                return false;
            int[] arr = new int[k];
            int previous = nums[0];
            Arrays.sort(nums);
            for(int x : nums){
                if(x != previous) {
                    if(x != previous + 1 && arr[(previous - 1) % k] != arr[previous % k])
                        return false;
                    if(arr[(previous - 1) % k] > arr[previous % k])
                        return false;
                    previous = x;
                }
                arr[previous % k]++;
            }
            return arr[(previous - 1) % k] == arr[previous % k];
        }
    }
}
