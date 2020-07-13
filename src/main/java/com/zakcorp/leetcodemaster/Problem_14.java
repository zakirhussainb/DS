package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_14 {
    static class Solver {
        public String solve(String[] strArr) {
            if(strArr.length == 0) {
                return "";
            }
            int n = strArr.length;
            for(int i = 0; i < strArr[0].length(); i++) {
                char ch1 = strArr[0].charAt(i);
                for(int j = 1; j < n; j++) {
                    if(i == strArr[j].length() || strArr[j].charAt(i) != ch1) {
                        return strArr[0].substring(0, i);
                    }
                }
            }
            return strArr[0];
        }
        public String solve1(String[] strArr) {
            if(strArr.length == 0) {
                return "";
            }
            String prefix = strArr[0];
            for(int i = 1; i < strArr.length; i++) {
                while( !strArr[i].startsWith(prefix) ) { // while ( strArr[i].indexOf(prefix) != 0)
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            return prefix;
        }
    }
}
