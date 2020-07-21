package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_686 {
    public int repeatedStringMatch(String A, String B) {
        int result = 1;
        if(A.contains(B)) {
            return result;
        }
        int m = A.length() + B.length();
        String str = A;
        for(int i = 1; i <= m; i++) {
            result++;
            str += A;
            if(str.contains(B)) {
                return result;
            }
            if(str.length() > m) {
                break;
            }
        }
        return -1;
    }
}
