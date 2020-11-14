package com.zakcorp.leetcodemaster.contest.biweekly.thirtynine;

import com.zakcorp.queues.impl.CircularQueue;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int[] solve1(int[] code, int k) {
            int n = code.length;
            if(k == 0) {
                return new int[n];
            }
            int[] result = new int[n];
            if(k > 0) {
                int limit = k;
                for(int i = 0; i < n; i++) {
                    int m = 1;
                    while(limit --> 0) {
                        int index = i + m;
                        if(index >= n) {
                            index = index % n;
                        }
                        result[i] += code[index];
                        m++;
                    }
                    limit = k;
                }
            } else {
                int limit = -k;
                for(int i = 0; i < n; i++) {
                    int m = n - 1;
                    while(limit --> 0) {
                        int index = i + m;
                        if(index >= n) {
                            index = index % n;
                        }
                        result[i] += code[index];
                        m--;
                    }
                    limit = -k;
                }
            }
            return result;
        }
    }
}
