package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_334 {
    static class Solver {
        public boolean solve1(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    for(int k = j + 1; k < n; k++) {
                        if(arr[i] < arr[j] && arr[j] < arr[k] && i < j && j < k) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public boolean solve2(int[] arr) {
            int n = arr.length;
            int firstNum = Integer.MAX_VALUE, secondNum = Integer.MAX_VALUE;
            for (int num : arr) {
                if (num <= firstNum) {
                    firstNum = num;
                } else if (num <= secondNum) {
                    secondNum = num;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
