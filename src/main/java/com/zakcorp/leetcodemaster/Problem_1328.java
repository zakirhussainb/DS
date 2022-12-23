package com.zakcorp.leetcodemaster;

import java.util.concurrent.atomic.AtomicBoolean;

public class Problem_1328
{
    static class Solver {
        public String solve1(String palindrome) {
            int n = palindrome.length();
            if(n == 1)
                return "";
            char[] chArr = palindrome.toCharArray();
            final AtomicBoolean flag = new AtomicBoolean(false);
            recursive(chArr, 0, flag);
            if(isPalindrome( chArr )) {
                chArr = palindrome.toCharArray();
                chArr[n - 1] = (char)(chArr[n - 1] + 1);
            }
            if(!flag.get()) {
                if(chArr[n - 1] == chArr[n - 2]) {
                    chArr[n - 1] = (char)(chArr[n - 1] + 1);
                }
            }
            return new String(chArr);
        }
        private void recursive(char[] chArr, int index, final AtomicBoolean flag) {
            if(index >= chArr.length)
                return;
            if(!isPalindrome(chArr))
                return;
            if(chArr[index] > 'a') {
                chArr[index] = 'a';
                flag.set( true );
            }
            recursive( chArr, index + 1, flag );
        }

        private boolean isPalindrome(char[] chArr) {
            int low = 0, high = chArr.length - 1;
            while(low < high) {
                if(chArr[low] == chArr[high]) {
                    low++;
                    high--;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
