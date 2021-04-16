package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1009 {
    static class Solver {
        public int solve1(int N) {
            String str = Integer.toBinaryString(N);
            StringBuilder sb = new StringBuilder();
            for(char ch : str.toCharArray()) {
                if(ch == '0') {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
            return Integer.parseInt(sb.toString(), 2);
        }
        public int solve2(int N) {
            // TODO:- Did not understand this method.
            if(N == 0)
                return 1;
            int m = 0;
            while(m < N) {
                m = (m * 2) + 1; // is same as m = (m << 2) | 1
            }
            return m - N;
        }
    }
}
