package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1528 {
    public String restoreString(String str, int[] indices) {
        int n = str.length();
        char[] chars = new char[n];
        for(int i = 0; i < n; i++) {
            chars[indices[i]] = str.charAt(i);
        }
        return new String(chars);
    }
}
