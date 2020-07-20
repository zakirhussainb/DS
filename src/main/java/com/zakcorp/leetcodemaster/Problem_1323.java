package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1323 {
    static class Solver {
        /*
            1. Convert the number to character array.
            2. Iterate from the front and check if the array has a '6';
                2.1 if yes then make it '9'.
                2.2 Form a new string.
                2.3 Find the max, by converting the string to int.
                2.4 Set the '9' to '6' in the charArr, so as to preserve the charArr.
            3. return max.
         */
        public int maximum69Number (int num) {
            int max = num;
            char[] chArr = Integer.toString(num).toCharArray();
            for(int i = 0; i < chArr.length; i++){
                if(chArr[i] == '6') {
                    chArr[i] = '9';
                    String str = new String(chArr);
                    max = Math.max(max, Integer.parseInt(str));
                    chArr[i] = '6';
                }
            }
            return max;
        }
    }
}
