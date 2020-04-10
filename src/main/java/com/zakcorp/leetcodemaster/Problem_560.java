package com.zakcorp.leetcodemaster;
import java.util.*;

public class Problem_560 {
    public int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> hMap = new HashMap<>();
        int currsum = 0;
        int counter = 0;
        for (int num : arr) {
            currsum = currsum + num;
            if (currsum == k) {
                counter++;
            }
            if (hMap.containsKey(currsum - k)) {
                counter = counter + hMap.get(currsum - k);
            }
//            hMap.put(currsum, !hMap.containsKey(currsum) ? 1 : hMap.get(currsum) + 1);
            hMap.put(currsum, hMap.getOrDefault(currsum, 0) + 1);
        }
        return counter;
    }
}
