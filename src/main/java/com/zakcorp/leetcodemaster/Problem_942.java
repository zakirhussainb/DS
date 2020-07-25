package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_942 {
    public int[] diStringMatch(String str) {
        // Time and Space Complexities -> O(n) and O(n)
        int N = str.length();
        int[] res = new int[N + 1];
        int iCount = 0, dCount = N;
        for(int i = 0; i < N; i++) {
            res[i] = (str.charAt(i) == 'I') ? iCount++ : dCount--;
        }
        // iCount will be increased and will be the final value, you can verify with test cases for better understanding
        res[N] = iCount;
        return res;
    }
}
