package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_139 {
    static class Solver {
        public boolean solve1(String str, List<String> wordDict) {
            StringBuilder sb = new StringBuilder(str);
            int i = 0, n = wordDict.size(), notfound = 0;
            if(n == 0)
                return false;
            Collections.sort(wordDict);
            while(sb.length() != 0) {
                int start = sb.indexOf(wordDict.get(i));
                int end = start + wordDict.get(i).length();
                if(sb.indexOf(wordDict.get(i)) >= 0) {
                    sb.delete(start, end);
                    notfound--;
                } else {
                    notfound++;
                }
                i++;
                i = i % n;
                if(notfound == n && sb.length() != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
