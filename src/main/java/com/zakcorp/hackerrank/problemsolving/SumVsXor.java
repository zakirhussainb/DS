package com.zakcorp.hackerrank.problemsolving;

/**
 * Created by Zakir Hussain B on 26/10/20.
 *
 * @source: Hackerrank
 * @topic: Algorithms
 * @sub-topic: Bit Manipulation
 * @platform: Hackerrank
 * @problem_link: https://www.hackerrank.com/challenges/sum-vs-xor/problem
 * @pseudocode:
 */
public class SumVsXor {
    static class Solver {
        // Brute Force Solution
        // TLE for n = 10^15
        public long solve1(long n) {
            long ans = 0;
            for(long i = 0; i <= n; i++) {
                if( (n | i) == (n ^ i) ) {
                    ans++;
                }
            }
            return ans;
        }
        // Solution using Bit Manipulation
        public long solve2(long n) {
            int zeroCount = countZeros(n);
            long result = 1L << zeroCount; // same as Math.pow(2, zeroCount);
            return result;
        }
        private int countZeros(long num) {
            int zeros = 0;
            while(num > 0) {
                if( (num & 1) == 0 ) {
                    zeros++;
                }
                num >>= 1;
            }
            return zeros;
        }
    }
}