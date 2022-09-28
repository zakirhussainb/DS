package com.zakcorp.leetcodemaster;

public class Problem_1390 {
    static class Solver {
        public int solve1(int[] arr) {
            int sum = 0;
            for(int num : arr) {
                int last_d = 0;
                for(int d = 2; d * d <= num; d++) {
                    if(num % d == 0) {
                        if(last_d == 0) {
                            last_d = d;
                        } else {
                            last_d = 0;
                            break;
                        }
                    }
                }
                if(last_d > 0 && last_d != num / last_d) {
                    sum += 1 + num + last_d + num / last_d;
                }
            }
            return sum;
        }
    }
}
