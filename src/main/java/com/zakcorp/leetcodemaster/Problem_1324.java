package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1324 {
    static class Solver {
        public List<String> solve1(String str) {
            String[] words = str.split(" ");

            // Find the size of the longest word
            int mx = 0;
            for (String s : words)
                mx = Math.max(mx, s.length());

            List<String> ans = new ArrayList<>();
            // Iterate words from o to max - 1
            for (int i = 0; i < mx; ++i) {
                StringBuilder sb = new StringBuilder();
                // if index is out of range of current word, then append space or else character at the curr index
                for (String word : words)
                    sb.append(i < word.length() ? word.charAt(i) : " ");
                // remove trailing space.
                while (sb.charAt(sb.length() - 1) == ' ')
                    sb.deleteCharAt(sb.length() - 1);
                // add the resulting string to the list
                ans.add(sb.toString());
            }
            return ans;
        }
    }
}
