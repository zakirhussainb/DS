package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1561 {
    /*
    Say that the sorted piles are p[0], p[1], ..., p[n-2], p[n-1]. Alice will get p[n-1] no matter which piles we pick first.

    If we just let Alice get that pile, which pile should we pick next? Right, it's the second-largest pile, p[n-2].

    And which pile should we give to poor Bob? The pile with the lowest value, p[0].

    We just repeat this process and always go for the second-largest pile. The piles each person ends up with will be:
        Alice: p[n-1], p[n-3], p[n-5], ...
        We: p[n-2], p[n-4], p[n-6], ...
        Bob: p[0], p[1], p[2], ...
     */
    static class Solver {
        public int solve1(int[] piles) {
            Arrays.sort(piles);
            int res = 0, n = piles.length;
            for(int i = n / 3; i < n; i += 2) {
                res += piles[i];
            }
            return res;
        }
    }
}
