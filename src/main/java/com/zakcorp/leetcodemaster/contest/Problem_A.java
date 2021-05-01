package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_5;

import java.util.*;
import java.util.Map;

public class Problem_A {
    static class Solver {
        public String solve1(String str) {
            // s = "a1b2c3d4e"
            StringBuilder res = new StringBuilder();
            int n = str.length();
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) {
                    res.append(str.charAt(i));
                } else {
                    res.append( (char)( str.charAt(i - 1) + (str.charAt(i)  - '0') ) );
                }
            }
            return res.toString();
        }
    }
}
