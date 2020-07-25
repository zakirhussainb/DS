package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_942 {
    public int[] diStringMatch(String str) {
        // Time and Space Complexities -> O(n) and O(n)
        int N = str.length();
        int[] res = new int[N + 1];
        int i = 0;
        int iCount = 0, dCount = N;
        while(i < N) {
            if(str.charAt(i) == 'I') {
                res[i++] = iCount++;
            } else {
                res[i++] = dCount--;
            }
        }
        res[i] = (str.charAt(N - 1) == 'I') ? iCount : dCount;
        return res;
    }
}
