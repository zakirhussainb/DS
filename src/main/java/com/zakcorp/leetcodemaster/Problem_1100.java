package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1100 {
    static class Solver {
        public int solve1(String str, int k) {
            int count = 0, n = str.length();
            Set<Character> set = new HashSet<>();
            int start = 0;
            for(int end = 0; end < n; end++) {
                char endCh = str.charAt(end);
                while(set.contains(endCh)) {
                    set.remove(str.charAt(start));
                    start++;
                }
                set.add(endCh);
                count += end - start + 1 >= k ? 1 : 0;
            }
            return count;
        }
    }
}
