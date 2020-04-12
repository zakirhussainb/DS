package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        s = getSorted(s.toCharArray());
        t = getSorted(t.toCharArray());
        return s.equals(t);
    }
    private String getSorted(char[] chArr) {
        Arrays.sort(chArr);
        return String.valueOf(chArr);
    }
}
