package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_402 {
    static class Solver {
        public String solve1(String str, int k) {
            int n = str.length();
            StringBuilder sb = new StringBuilder(str);
            for(int i = 1; i < n; i++) {
                while( k > 0 && i < sb.length() && sb.charAt(i - 1) > sb.charAt(i) ) {
                    sb.deleteCharAt(i - 1);
                    k--;
                }
            }
            // Corner case for Monotonically increasing sequence -> eg. 112, 1111, 337
            while( k > 0 && sb.length() >= 1 ) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            // Corner case with leading zeros
            while( sb.length() >= 1 && sb.charAt(0) == '0' ) {
                sb.deleteCharAt(0);
            }
            return sb.length() == 0 ? "0" : sb.toString();
        }
    }
}
