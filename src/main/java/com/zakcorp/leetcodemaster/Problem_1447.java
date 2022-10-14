package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1447 {
    static class Solver {
        public List<String> solve1(int n) {
            List<String> list = new ArrayList<>();
            for(int i = 1; i <= n; i++) {
                for(int j = i + 1; j <= n; j++) {
                    if( gcd(i, j) == 1)
                        list.add(i + "/" + j);
                }
            }
            return list;
        }
        private int gcd(int a, int b) {
            if(a == 0) {
                return b;
            }
            return gcd(b % a, a);
        }
    }
}
