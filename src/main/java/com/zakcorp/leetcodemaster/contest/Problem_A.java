package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int[] solve1(int[] arr) {
            Arrays.sort(arr);
            int n = arr.length;
            int[] res = new int[2];
            int pairs = 0;
            int removedNumbers = 0;
            for(int i = 1; i < n;) {
                if(arr[i - 1] == arr[i]) {
                    pairs++;
                    removedNumbers += 2;
                    i += 2;
                } else {
                    i++;
                }
            }
            res[0] = pairs;
            res[1] = arr.length - removedNumbers;
            return res;
        }
    }
}
