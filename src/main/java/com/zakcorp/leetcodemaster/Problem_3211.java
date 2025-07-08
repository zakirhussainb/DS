package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_3211
{
    static class Solver {
        public List<String> solve1(int n) {
            List<String> result = new ArrayList<>();
            generateStrings(result, new StringBuilder(), n, -1);
            return result;
        }
        private void generateStrings(List<String> result, StringBuilder sb, int n, int lastChar) {
            if (sb.length() == n) {
                result.add(sb.toString());
                return;
            }

            // Add '1' to the string
            sb.append('1');
            generateStrings(result, sb, n, 1);
            sb.deleteCharAt(sb.length() - 1);

            // Add '0' to the string, only if the last character was not '0'
            if (lastChar != 0) {
                sb.append('0');
                generateStrings(result, sb, n, 0);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
