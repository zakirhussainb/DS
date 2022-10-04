package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2150 {
    static class Solver {
        public List<Integer> solve1(int[] arr) {
            List<Integer> list = new ArrayList<>();
            Arrays.sort(arr);
            int n = arr.length;
            for(int i = 0; i < n; ) {
                if(i == 0) {
                    if(i + 1 < n && (arr[i] == arr[i + 1] || arr[i] + 1 == arr[i + 1]) ) {
                        i++;
                    } else {
                        list.add(arr[i]);
                        i++;
                    }
                } else {
                    if(arr[i] == arr[i - 1] || arr[i] == arr[i - 1] + 1) {
                        i++;
                    } else if(i + 1 < n && (arr[i] == arr[i + 1] || arr[i] + 1 == arr[i + 1]) ) {
                        i++;
                    } else {
                        list.add(arr[i]);
                        i++;
                    }
                }
            }
            return list;
        }
    }
}
