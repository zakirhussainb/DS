package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_925 {
    static class Solver {
        public boolean isLongPressedName(String name, String typed) {
            int i = 0, j = 0;
            int m = name.length();
            int n = typed.length();
            while(i < m && j < n) {
                char ch1 = name.charAt(i);
                char ch2 = typed.charAt(j);
                if(ch1 != ch2) {
                    return false;
                }
                int count1 = 0;
                while(i < m && name.charAt(i) == ch1) {
                    count1++;
                    j++;
                }
            }
            return false;
        }
    }
}
