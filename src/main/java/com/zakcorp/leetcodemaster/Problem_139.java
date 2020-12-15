package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_139 {
    static class Solver {
        public boolean solve1(String str, List<String> wordDict) {
            StringBuilder sb = new StringBuilder(str);
            int i = 0, n = wordDict.size();
            while(sb.length() != 0) {
                int start = sb.indexOf(wordDict.get(i));
                int end = start + wordDict.get(i).length();
                if(sb.indexOf(wordDict.get(i)) >= 0) {
                    sb.delete(start, end);
                } else {
                    return false;
                }
                i++;
                i = i % n;
            }
            return true;
        }
    }
}
