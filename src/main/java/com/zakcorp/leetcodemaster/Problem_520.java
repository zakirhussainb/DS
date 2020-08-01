package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_520 {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int lc = 0, uc = 0;
        for(int i = 1; i < n; i++) {
            if(Character.isLowerCase(word.charAt(i))) {
                lc++;
            } else {
                uc++;
            }
        }
        if(Character.isUpperCase(word.charAt(0))) {
            return ( lc == n - 1 || uc == n - 1 );
        } else {
            return lc == n - 1;
        }
    }
}
