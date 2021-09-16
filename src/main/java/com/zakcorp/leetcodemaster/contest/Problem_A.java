package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_5;

import java.util.*;
import java.util.Map;

public class Problem_A {
    static class Solver {
        public String solve1(String str) {
            int n = str.length();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; i++) {
                int count = 1;
                while( i < n - 1 && str.charAt(i) == str.charAt(i + 1) ) {
                    count++;
                    i++;
                }
                sb.append(count);
                sb.append(str.charAt(i));
            }

            return sb.toString();
        }
    }
}
