package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_167 {
    //Only one pair which is equal to target
    // Remember here the array is sorted.
    // So need of hashing.
    public int[] twoSum(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high) {
            int sum = arr[low] + arr[high];
            if(sum == target) {
                return new int[]{low + 1, high + 1};
            } else if(sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return null;
    }
}
