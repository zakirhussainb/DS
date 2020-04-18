package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1323 {
    static class Solver {
        public int maximum69Number (int num) {
            // Convert int to char[]
            // Replace the first 6 to 9. thats it.
            char[] chArr = Integer.toString(num).toCharArray();
            for(int i = 0; i < chArr.length; i++){
                if(chArr[i] == '6') {
                    chArr[i] = '9';
                    break;
                }
            }
            return Integer.parseInt(new String(chArr));
        }
    }
}
