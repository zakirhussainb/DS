package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1160 {
    static class Solver {
        public int countCharacters(String[] words, String chars) {
            int[] countArr = new int[26];
            //Count number of characters in "chars" and store it in "arr"
            for(char ch : chars.toCharArray()) {
                countArr[ch - 'a']++;
            }
            int count = 0;
            for(String str : words) {
                // create copy of "countArr" for this word
                int[] tempCountArr = Arrays.copyOf(countArr, 26);
                boolean valid = true;
                for(char ch : str.toCharArray()) {
                    tempCountArr[ch - 'a']--;
                    // No enough count of character
                    if(tempCountArr[ch - 'a'] < 0) {
                        valid = false;
                        break;
                    }
                }
                if(valid) {
                    count += str.length();
                }
            }
            return count;
        }
    }
}
