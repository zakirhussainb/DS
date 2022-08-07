package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_C {
    static class Solver {
        public boolean solve1(int[] arr) {
            int n = arr.length;
            Arrays.sort(arr);
            boolean one = false;
            boolean two = false;
            for(int i = 1; i < n; i++) {
                if(arr[i - 1] == arr[i]) {
                    one = true;
                }
                if(arr[i - 1] == arr[i] && arr[i] == arr[i + 1]) {
                    two = true;
                }
            }
            if(one && two)
                return true;
            boolean three = false;
            for(int i = 1; i < n; i++) {
                if (arr[i - 1] + 1 == arr[i] && arr[i] + 1 == arr[i + 1]) {
                    three = true;
                    break;
                }
            }
            return one && three || two && three;
        }
    }
}