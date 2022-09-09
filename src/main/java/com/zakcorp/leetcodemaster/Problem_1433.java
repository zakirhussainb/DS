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
}
