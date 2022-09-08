package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1887
{
    static class Solver {
        public int solve1(int[] arr) {
            Arrays.sort(arr);
            int res = 0;
            for(int i = arr.length - 1; i > 0; i--) {
                if(arr[i - 1] != arr[i]) {
                    res += arr.length - i;
                }
            }
            return res;
        }
    }
}
