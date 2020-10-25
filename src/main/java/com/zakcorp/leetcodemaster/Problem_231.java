package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_231 {
    static class Solver {
        public boolean isPowerOfTwo_approach1(int n) {
            // Iterative
            if(n <= 0){
                return false;
            }
            while(n % 2 == 0){
                n = n / 2;
            }
            return n == 1;
        }
        public boolean isPowerOfTwo_approach2(int n) {
            // Recursive
            return n > 0 && ( n == 1 || (n % 2 == 0 && isPowerOfTwo_approach2(n / 2)) );
        }
        public boolean isPowerOfTwo_approach6(int n) {
//            There are only 31 numbers in total for an 32-bit integer.
//            time complexity = O(1)
            return new HashSet<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608,16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824)).contains(n);
        }
        public boolean isPowerOfTwo_Bit_Manipulation(int n) {
            if(n <= 0) {
                return false;
            }
            return (n & (n - 1)) == 0;
        }
    }
}
