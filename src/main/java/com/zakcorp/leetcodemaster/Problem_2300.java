package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2300
{
    static class Solver {
        public int[] solve1(int[] spells, int[] potions, long success) {
            int n = spells.length;
            int m = potions.length;
            int[] res = new int[n];
            Arrays.sort(potions);
            for(int i = 0; i < n; i++) {
                int low = 0, high = m;
                long x = spells[i];
                while(low < high) {
                    int mid = (low + (high - low) / 2);
                    if(x * potions[mid] >= success) {
                        res[i] = m - mid;
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
            return res;
        }
    }
}
