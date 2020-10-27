package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_762 {
    static class Solver {
        public int solve1(int L, int R) {
            int count = 0;
            for(int i = L; i <= R; i++) {
                count += countSetBitsAlternate(i);
            }
            return count;
        }
        private int countSetBitsSimple(int num) {
            int count = 0;
            while(num > 0) {
                if( (num & 1) == 1 ) {
                    count++;
                }
                num = num >> 1;
            }
            return count;
        }
        // Brian Kernighan’s Algorithm:
        private int countSetBitsAlternate(int num) {
            int count = 0;
            while(num > 0) {
                num = (num & (num - 1));
                count++;
            }
            return count;
        }
    }
}
