package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_767 {
    static class Solver {
        public String solve1(String str) {
            StringBuilder sb = new StringBuilder();
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            str = new String(chArr);
            int n = str.length();
            int i = 0, j = n - 1;
            while(i <= j) {
                if(str.charAt(i) != str.charAt(j)) {
                    sb.append(str.charAt(i)).append(str.charAt(j));
                    i++; j--;
                } else {
                    if(sb.length() != 0 && i == j) {
                        sb.append(str.charAt(i));
                        i++; j--;
                    } else {
                        return "";
                    }
                }
            }
            return sb.toString();
        }
    }
}
