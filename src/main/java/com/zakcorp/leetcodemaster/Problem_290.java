package com.zakcorp.leetcodemaster;

import java.util.*;
public class Problem_290 {
    static class Solver {
        public boolean wordPattern(String pattern, String str) {
            String[] strSplit = str.split("\\s+");
            int m = pattern.length();
            int n = strSplit.length;
            if(m != n) {
                return false;
            }
            Map<Character, String> map = new HashMap<>();
            for(int i = 0; i < m; i++) {
                char ch1 = pattern.charAt(i);
                if(!map.containsKey(ch1) && !map.containsValue(strSplit[i])) {
                    map.put(ch1, strSplit[i]);
                } else if(map.containsKey(ch1)) {
                    if( !map.get(ch1).equals(strSplit[i]) ) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
