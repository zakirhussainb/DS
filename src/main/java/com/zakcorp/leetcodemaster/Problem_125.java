package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_125 {
    public boolean isPalindrome(String str) {
        if(str.isEmpty()) {
            return true;
        }
        int i = 0; int j = str.length() - 1;
        str = str.toLowerCase();
        while(i <= j) {
            if( Character.isLetterOrDigit(str.charAt(i)) && Character.isLetterOrDigit(str.charAt(j)) ) {
                if(str.charAt(i) == str.charAt(j)) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            } else if( !Character.isLetterOrDigit(str.charAt(i)) && Character.isLetterOrDigit(str.charAt(j)) ) {
                i++;
            } else {
                j--;
            }
        }
        return true;
    }
}
