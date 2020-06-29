package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_387 {
    static class Solver {
        public int firstUniqChar(String str) {
            int n = str.length();
            int[] arr = new int[26];
            for(int i = 0; i < n; i++) {
                arr[str.charAt(i) - 'a']++;
            }
            for(int i = 0; i < n; i++) {
                if(arr[str.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}
