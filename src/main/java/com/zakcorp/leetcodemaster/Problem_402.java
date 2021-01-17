package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_402 {
    static class Solver {
        public String solve1(String str, int k) {
            int n = str.length();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; i++) {
                while( k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > str.charAt(i) ) {
                    sb.deleteCharAt(sb.length() - 1);
                    k--;
                }
                sb.append(str.charAt(i));
            }
            // Corner case for Monotonically increasing sequence -> eg. 112, 1111, 337
            while( k > 0 && sb.length() > 0 ) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            // Corner case with leading zeros
            while( sb.length() > 0 && sb.charAt(0) == '0' ) {
                sb.deleteCharAt(0);
            }
            return sb.length() == 0 ? "0" : sb.toString();
        }
    }
}
