package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_3106
{
    static class Solver {
        public String solve1(String s, int k) {
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int left = 123 - ch;
                int right = ch - 97;
                int mnn = Math.min(left, right);
                if(k > 0) {
                    if(k >= mnn) {
                        ans.append("a");
                    } else {
                        ch = (char)(ch - k);
                        ans.append(ch);
                    }
                    k -= mnn;
                } else {
                    ans.append(ch);
                }
            }
            return ans.toString();
        }
    }
}
