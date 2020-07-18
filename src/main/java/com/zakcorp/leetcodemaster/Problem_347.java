package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_347 {
    public int[] topKFrequent(int[] arr, int k) {
        // TODO:- This is incomplete and wrong solution.
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int[] res = new int[k];
        final int[] i = {0};
        map.forEach( (key,val) -> {
            if(val >= k && i[0] < k) {
                res[i[0]++] = key;
            }
        });
        if(res.length == 0) {
            return arr;
        }
        return res;
    }
}
