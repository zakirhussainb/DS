package com.zakcorp.leetcodemaster;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem_204 {
    static class Solver {
        public int countPrimes(int n) {
            boolean[] isPrime = new boolean[n];
            int count = 0;
            for(int i = 2; i * i < n; i++) {
                if(!isPrime[i]) {
                    count++;
                    for(int j = 2; i * j < n; j++) {
                        isPrime[i * j] = true;
                    }
                }
            }
            return count;
        }
    }
}
