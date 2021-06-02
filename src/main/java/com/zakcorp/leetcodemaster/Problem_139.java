package com.zakcorp.leetcodemaster;

import java.util.*;

/*
TODO:- Need to implement the Bottom-Up approach via Dynamic Programming.
 */
public class Problem_139 {
    // Throws a TLE error
    static class Solver {
        public boolean solve1(String str, List<String> wordDict) {
            return wordBreak(str, new HashSet<>(wordDict), 0);
        }
        private boolean wordBreak(String str, Set<String> wordDict, int start) {
            if(start == str.length())
                return true;
            for(int end = start + 1; end <= str.length(); end++) {
                if( wordDict.contains(str.substring(start, end)) && wordBreak(str, wordDict, end) )
                    return true;
            }
            return false;
        }
    }

    // Recursion with Memoization - Top Down Approach
    static class Solver1 {
        public boolean solve1(String str, List<String> wordDict) {
            return wordBreak(str, new HashSet<>(wordDict), 0, new Boolean[str.length()]);
        }
        private boolean wordBreak(String str, Set<String> wordDict, int start, Boolean[] memo) {
            if(start == str.length())
                return true;
            if(memo[start] != null)
                return memo[start];
            for(int end = start + 1; end <= str.length(); end++) {
                if( wordDict.contains(str.substring(start, end)) && wordBreak(str, wordDict, end, memo) )
                    return memo[start] = true;
            }
            return memo[start] = false;
        }
    }
}

class LeetCodeSolution {
    public boolean wordBreak(String targetStr, List<String> wordDict) {
        // Solver p = new Solver();
        // return p.solve(targetStr, wordDict);
        Solver1 p1 = new Solver1();
        return p1.solve(targetStr, wordDict);
    }
    static class Solver {
        public boolean solve(String targetStr, List<String> wordDict) {
            if(targetStr.isEmpty())
                return true;
            for(String word : wordDict) {
                if(targetStr.startsWith(word)) {
                    String suffix = targetStr.substring(word.length());
                    if( solve(suffix, wordDict) ){
                        return true;
                    }
                }
            }
            return false;
        }
    }
    static class Solver1 {
        public boolean solve(String targetStr, List<String> wordDict) {
            Map<String, Boolean> map = new HashMap<>();
            return solveWithMemo(targetStr, wordDict, map);
        }
        private boolean solveWithMemo(String targetStr, List<String> wordDict, Map<String, Boolean> map) {
            if(map.containsKey(targetStr)) {
                return map.get(targetStr);
            }
            if(targetStr.isEmpty())
                return true;
            for(String word : wordDict) {
                if(targetStr.startsWith(word)) {
                    String suffix = targetStr.substring(word.length());
                    if( solveWithMemo(suffix, wordDict, map) ){
                        map.put(suffix, true);
                        return true;
                    }
                }
            }
            map.put(targetStr, false);
            return false;
        }
    }
}
