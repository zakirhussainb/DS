package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1433
{
    static class Solver {
        public boolean solve1(String s1, String s2) {
            char[] ch1 = s1.toCharArray();
            Arrays.sort(ch1);
            String str1 = new String(ch1);
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch2);
            String str2 = new String(ch2);
            int i = 0;
            int s1Counter = 0;
            int s2Counter = 0;
            while(i < str1.length()) {
                if(str1.charAt( i ) > str2.charAt( i )) {
                    s1Counter++;
                } else if(str1.charAt( i ) < str2.charAt( i )){
                    s2Counter++;
                } else {
                    s1Counter++;
                    s2Counter++;
                }
                i++;
            }
            return s1Counter == s1.length() || s2Counter == s1.length();
        }
    }
    /*
    Can be done without sorting the arrays also.
        -> Create two individual hash arrays to store the occurrences of characters in a string.
        -> Calculate the difference of arr1_i - arr2_i and add it to s.
        -> if s is negative then return false.
        -> Now Check for the arr2_i - arr1_i.
        Note : You need to check both scenarios, because it is mentioned in the question that s2 can break s1 or vice-versa.
     */
    static class Solver1 {
        public boolean solve1(String s1, String s2) {
            int[] dt1 = new int[26];
            int[] dt2 = new int[26];
            for(int i = 0; i < s1.length(); i++) {
                dt1[s1.charAt( i ) - 'a']++;
                dt2[s2.charAt( i ) - 'a']++;
            }
            return check(dt1, dt2) || check(dt2, dt1);
        }
        private boolean check(int[] dt1, int[] dt2) {
            int s = 0;
            for (int i = 0; i < 26; i++) {
                int diff = dt1[i] - dt2[i];
                s += diff;
                if (s < 0)
                    return false;
            }
            return true;
        }
    }
}
