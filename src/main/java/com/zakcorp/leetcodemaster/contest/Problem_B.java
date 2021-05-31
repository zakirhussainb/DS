package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.graphs.algorithms.PrimsAlgorithm;
import com.zakcorp.leetcodemaster.Problem_207;

import java.util.*;

public class Problem_B {
    static class Solver {
        public String solve1(String str, int x) {
            StringBuilder res = new StringBuilder();
            int m = str.length();
            for(int i = 1; i < m; i++) {
                if(str.charAt(i - 1)  - '0' <= x && str.charAt(i)  - '0' <= x) {
                    System.out.println("ONE");
                    res.append(str.charAt(i - 1));
                    res.append(x);
                } else if(str.charAt(i - 1)  - '0' <= x && str.charAt(i)  - '0' >= x) {
                    System.out.println("TWO");
                } else if(str.charAt(i - 1)  - '0' >= x && str.charAt(i)  - '0' <= x) {
                    System.out.println("THREE");
                    res.append(str.charAt(i - 1));
                } else if(str.charAt(i - 1)  - '0' >= x && str.charAt(i)  - '0' >= x) {
                    System.out.println("FOUR");
                    res.append(str.charAt(i - 1));
                }
            }
            res.append(str.charAt(str.length() - 1));
            res.append(x);
            return res.toString();
        }
    }
}
