package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.List;

public class Problem_22
{
    static class Solver {
        public List<String> solve1(int n) {
            List<String> result = new ArrayList<>();
            generateParanthesis(result, "", n, 0, 0);
            return result;
        }
        private void generateParanthesis(List<String> result, String str, int n, int open, int close) {
            if(open == close && open + close == 2 * n) {
                result.add(str);
                return;
            }
            if(open < n) {
                generateParanthesis(result, str + "(", n, open + 1, close);
            }

            if(close < open) {
                generateParanthesis(result, str + ")", n, open, close + 1);
            }
        }
    }

    // Solution using StringBuilder
    static class Solver1 {
        public List<String> solve1(int n) {
            List<String> result = new ArrayList<>();
            generateParanthesis(result, new StringBuilder(), n, 0, 0);
            return result;
        }
        private void generateParanthesis(List<String> result, StringBuilder sb, int n, int open, int close) {
            if(open == close && open + close == 2 * n) {
                result.add(sb.toString());
                return;
            }
            if(open < n) {
                sb.append("(");
                generateParanthesis(result, sb, n, open + 1, close);
                sb.deleteCharAt(sb.length() - 1);
            }

            if(close < open) {
                sb.append(")");
                generateParanthesis(result, sb, n, open, close + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
