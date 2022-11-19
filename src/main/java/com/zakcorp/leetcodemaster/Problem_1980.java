package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1980
{
    static class Solver {
        public String solve1(String[] arr) {
            Set<String> set = new HashSet<>(new ArrayList<>(Arrays.asList( arr )));
            return backtrack(0, arr[0], set);
        }
        private String backtrack(int index, String str, Set<String> set) {
            if(index > str.length())
                return "";
            char[] chArr = str.toCharArray();
            if(chArr[index] == '1')
                chArr[index] = '0';
            else
                chArr[index] = '1';
            String newStr = new String(chArr);
            if(!set.contains(newStr)) {
                return newStr;
            }
            return backtrack( index + 1, newStr, set );
        }

        public String solve2(String[] arr) {
            StringBuilder s = new StringBuilder("");
            for (int i = 0; i < arr.length; i++) {
                s.append(arr[i].charAt(i) == '0' ? '1' : '0');
            }
            return s.toString();
        }
    }
}
