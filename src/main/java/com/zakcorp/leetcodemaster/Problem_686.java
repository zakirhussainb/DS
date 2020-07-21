package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_686 {
    static class Solver {
        public int solve1(String A, String B) {
            int result = 1;
            if(A.contains(B)) {
                return result;
            }
            int m = A.length() + B.length();
            String str = A;
            for(int i = 1; i <= m; i++) {
                result++;
                str += A;
                if(str.contains(B)) {
                    return result;
                }
                if(str.length() > m) {
                    break;
                }
            }
            return -1;
        }
        public int solve2(String A, String B) {
            int result = 1;
            StringBuilder sb = new StringBuilder(A);
            for(; sb.length() < B.length(); result++) {
                sb.append(A);
            }
            if(sb.indexOf(B) >= 0) {
                return result;
            }
            if(sb.append(A).indexOf(B) >= 0){
                return result+1;
            }
            return -1;
        }
    }
}
