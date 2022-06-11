package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int[] solve1(int[] spells, int[] potions, long success) {
            int n = spells.length;
            int m = potions.length;
            int[] originalSpells = Arrays.copyOf(spells, n);
            Arrays.sort(spells);
            Arrays.sort(potions);
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = n - 1; i >= 0; i--) {
                int count = 0;
                for(int j = m - 1; j >= 0; j--) {
                    long prod = (long) spells[i] * potions[j];
                    if(prod >= success) {
                        count++;
                    } else {
                        break;
                    }
                }
                map.put(spells[i], count);
            }
            int[] res = new int[n];
            for(int i = 0; i < n; i++) {
                if(map.containsKey(originalSpells[i])) {
                    res[i] = map.get(originalSpells[i]);
                }
            }
            return res;
        }
    }
}
