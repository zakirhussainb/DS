package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_3096 {
    static class Solver {
        public int solve1(int[] possible) {
            int ts = 0;
            int n=possible.length;
            for(int i=0;i<n;i++){
                if(possible[i] == 0) {
                    ts += -1;
                    possible[i] = -1;
                } else {
                    ts += 1;
                }
            }

            int alexMaxPoint = 0;
            int alexMinLevel = 0;
            int bobMinLevel = 0;
            for(int i=0;i<n;i++){
                alexMaxPoint += possible[i];
                alexMinLevel++;
                int bobMaxPoint = ts - alexMaxPoint;
                bobMinLevel = n - alexMinLevel;
                if(alexMaxPoint > bobMaxPoint) {
                    if(bobMinLevel > 0) {
                        return i + 1;
                    }
                }
            }
            return -1;
        }
    }
}
