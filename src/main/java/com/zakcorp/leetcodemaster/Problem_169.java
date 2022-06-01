package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_169 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int k = n / 2; int majority = 0;
            for(int i = 0, mask = 1; i < 32; i++, mask <<= 1) {
                int bits = 0;
                for(int num : arr) {
                    if( (num & mask) == 1) {
                        bits++;
                    }
                }
                if(bits > k) {
                    majority |= mask;
                }
            }
            return majority;
        }
        public int solve2(int[] arr) {
            int counter = 0;
            int candidate = 0;
            for(int num : arr) {
                if(counter == 0)
                    candidate = num;
                counter += (num == candidate) ? 1 : -1;
            }
            return candidate;
        }
    }
}
