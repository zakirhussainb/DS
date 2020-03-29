package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1394 {
    public static void main(String[] args) {
        Problem_1394 p = new Problem_1394();
        int[] arr = {2, 2, 3, 4};
        int luckyInt = p.findLucky(arr);
        System.out.println(luckyInt);
    }

    public int findLucky(int[] arr) {
        final int[] max = {-1};
        final Map<Integer, Integer> map = new HashMap<>();
        for (int item : arr) {
            map.put(item, !map.containsKey(item) ? 1 : map.get(item) + 1);
        }
        map.forEach((key, value) -> {
            if (key.equals(value)) {
                max[0] = Math.max(max[0], value);
            }
        });
        return max[0];
    }
}
