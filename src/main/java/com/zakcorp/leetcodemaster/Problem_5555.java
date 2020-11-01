package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_5555 {
    public int countVowelStrings(int n) {
        return permutation(n, 0);
    }
    private int permutation(int n, int last) {
        if(n == 0) {
            return 1;
        }
        int count = 0;
        for(int i = last; i < 5; i++) {
            count += permutation(n - 1, i);
        }
        return count;
    }
}
