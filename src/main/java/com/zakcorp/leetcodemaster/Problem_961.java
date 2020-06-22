package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_961 {
    static class Solver {
        public int repeatedNTimes(int[] arr) {
            int max = Integer.MIN_VALUE;
            for(int num : arr) {
                max = Math.max(max, num);
            }
            int[] res = new int[max + 1];
            int m = arr.length;
            int N = m / 2;
            for (int num : arr) {
                res[num]++;
            }
            for(int i = 0; i < res.length; i++) {
                if(res[i] == N) {
                    return i;
                }
            }
            return -1;
        }
    }
    static class Solver1 {
        public int repeatedNTimes(int[] arr) {
            // Since only one element is going to be repeated, we can easily return the first duplicate from the set.
            Set<Integer> set = new HashSet<>();
            for(int num : arr) {
                if(set.contains(num)) {
                    return num;
                } else {
                    set.add(num);
                }
            }
            return 0;
        }
    }
}
