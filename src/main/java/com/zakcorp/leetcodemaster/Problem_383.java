package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_383 {
    static class Solver {
        public boolean solve1(String ransomNote, String magazine) {
            int[] hash = new int[26];
            if(ransomNote.length() > magazine.length())
                return false;
            for(char ch : ransomNote.toCharArray()) {
                int ind = magazine.indexOf(ch, hash[ch - 'a']);
                if(ind == -1)
                    return false;
                hash[ch - 'a'] = ind + 1;
            }
            return true;
        }
    }
}
