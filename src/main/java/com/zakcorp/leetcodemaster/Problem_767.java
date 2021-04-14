package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_767 {
    static class Solver {
        /*
        Steps:-
        1. Create a hash array, that stores each characters occurrence count in the string.
        2. Find the character with the maximum occurrence in the given string.
        3. Create a resultant character array, resCharArr and fill this maximum occurring character in alternating positions in that
        array.
        4. Finally fill all the other remaining characters in that array and return it.
        */
        public String solve1(String str) {
            // Creating a hash array, containing the character and its count
            int n = str.length();
            int[] hash = new int[26];
            for(int i = 0; i < n; i++) {
                hash[str.charAt(i) - 'a']++;
            }
            // Find the maximum occurring character in the hash array.
            int max = 0, letterIndex = 0;
            for(int i = 0; i < hash.length; i++) {
                if(hash[i] > max) {
                    max = hash[i];
                    letterIndex = i;
                }
            }

            // If the max value is greater than this condition, then it is not possible to reorganize string in such alternating pattern.
            if(max > (n + 1) / 2)
                return "";
            // Creating a result character array and inserting the maximum occurring character in alternating positions in this array.
            char[] resCharArr = new char[n];
            int idx = 0;
            while(hash[letterIndex] --> 0) {
                resCharArr[idx] = (char)(letterIndex + 'a');
                idx+=2;
            }
            // Doing the above same process for the rest of the characters
            for(int i = 0; i < hash.length; i++) {
                while(hash[i] --> 0) {
                    if(idx >= resCharArr.length)
                        idx = 1;
                    resCharArr[idx] = (char)(i + 'a');
                    idx+=2;
                }
            }
            return new String(resCharArr);
        }
    }
}
