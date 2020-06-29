package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1441 {
    static class Solver {
        public List<String> buildArray(int[] target, int n) {
            List<String> result = new ArrayList<>();
            int i = 0;
            int j = 1;
            while(i < target.length && j <= n) {
                result.add("Push");
                if(target[i] == j) {
                    i++;
                } else {
                    result.add("Pop");
                }
                j++;
            }
            return result;
        }
    }
}
