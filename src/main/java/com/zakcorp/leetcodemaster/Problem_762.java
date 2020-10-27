package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_762 {
    static class Solver {
        public int solve1(int L, int R) {
            int count = 0;
            System.exit(0);
            for(int i = L; i <= R; i++) {
                if(isSmallPrime(Integer.bitCount(i))) {
                    count++;
                }
            }
            return count;
        }
        private boolean isPrime(int num) {
            if(num <= 1){
                return false;
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
        // This is slow
        private int countSetBitsSimple(int num) {
            int count = 0;
            while(num > 0) {
                if( (num & 1) == 1 ) {
                    count++;
                }
                num = num >> 1;
            }
            return count;
        }
        // Brian Kernighan’s Algorithm: THIS IS FAST
        //11111111111111111111111111111111
        //11111111111111111111111111111101
        private int countSetBitsAlternate(int num) {
            int count = 0;
            while(num != 0) { // here this condition (n != 0) is important instead of (n > 0), because, of this input, 11111111111111111111111111111111
                num = (num & (num - 1));
                count++;
            }
            return count;
        }
        private boolean isSmallPrime(int num) {
            return (num == 2 || num == 3 || num == 5 || num == 7 ||
                    num == 11 || num == 13 || num == 17 || num == 19 );
        }
    }
}
