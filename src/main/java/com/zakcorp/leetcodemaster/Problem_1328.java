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
    static class Solver1 {
        /*
        Check half of the string
        Replace a non 'a' character to 'a'
        To handle cases like, 'aabaa', 'aa', 'aba' -> set the last character to b
         */
        public String solve1(String palindrome) {
            int n = palindrome.length();
            if(n == 1)
                return "";

            char[] chArr = palindrome.toCharArray();
            // Since we are traversing for only half of the string. 'aabaa' will be skipped, and it will not be replaced here.
            for(int i = 0; i < n / 2; i++){
                if(chArr[i] != 'a'){
                    chArr[i] = 'a';
                    return new String(chArr);
                }
            }
            // By the time it reaches here, the possible cases are 'aaa', 'aba', 'aabaa', etc.
            // So we should replace the last character to achieve the smallest one possible, in this case, 'b'
            chArr[n - 1] = 'b';
            return new String(chArr);
        }
    }
}
