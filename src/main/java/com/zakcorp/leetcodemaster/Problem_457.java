package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 07/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_457 {
    static class Solver {
        public boolean solve1(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                int m = i;
                do {
                    m = m + arr[m];
                    if(m < 0) {
                        break;
                    }
                    if(m > n - 1) {
                        m = m % n;
                        if(m > i) {
                            break;
                        }
                        if(m == i) {
                            return true;
                        }
                    }
                }while(m != i);
            }
            return false;
        }
    }
}