package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_190 {
    static class Solver {
        public int solve1(int n) {
            return Integer.reverse(n);
        }
        public int solve2(int n) {
            int result = 0;
            for(int i = 0; i < 32; i++) {
                result = result << 1;
                result = result | (n & 1);
                n = n >> 1;
            }
            return result;
        }
        public int solve3(int n) {
            // Performing arithmetic operations like * 2, % 2 and / 2 on a negative number will preserve the sign.
            // Other than switching to full bitwise ops, we can also convert negative numbers to a positive one first
            // and convert back again later by doing a bitwise negation, so all the arithmetic ops still work.
            // If you prefer bitwise ops, you can replace
            //       1. sum *= 2 with sum <<= 1;
            //       2. sum += n % 2 with sum |= n & 1;
            //       3. n /= 2 with n >>= 1 or n >>>= 1
            // However, internally the CPU takes the same number of clocks to process them.
            boolean isNegative = n < 0;
            if(isNegative) {
                n = ~n;
            }
            int result = 0;
            for(int i = 0; i < 32; i++) {
                result = result * 2;
                result = result + (n % 2);
                n = n / 2;
            }
            return isNegative ? ~result : result;
        }
    }
}
