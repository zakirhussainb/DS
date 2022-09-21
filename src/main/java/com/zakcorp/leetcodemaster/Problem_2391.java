package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_2391 {
    static class Solver {
        public int solve1(String[] garbage, int[] travel) {
            int m = 0, p = 0, g = 0;
            for(int i = 0; i < garbage.length; i++) {
                for(char ch : garbage[i].toCharArray()) {
                    if(ch == 'M')
                        m++;
                    else if(ch == 'G')
                        g++;
                    else
                        p++;
                }
            }
            boolean gF = false, pF = false, mF = false;
            for(int i = garbage.length - 1; i >= 0; i--) {
                for(char ch : garbage[i].toCharArray()) {
                    if(ch == 'G' && !gF) {
                        for(int k = 0; k < i; k++) {
                            g+= travel[k];
                        }
                        gF = true;
                    }
                    else if(ch == 'M' && !mF) {
                        for(int k = 0; k < i; k++) {
                            m+= travel[k];
                        }
                        mF = true;
                    } else if(ch == 'P' && !pF) {
                        for(int k = 0; k < i; k++) {
                            p+= travel[k];
                        }
                        pF = true;
                    }
                }
                if(gF && pF && mF)
                    break;
            }
            return g + m + p;
        }
    }
}
