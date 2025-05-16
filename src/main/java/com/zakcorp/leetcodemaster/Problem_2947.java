package com.zakcorp.leetcodemaster;

public class Problem_2947 {
    static class Solver {
        public int solve1(String s, int k) {
            int n = s.length();
            int start = 0;
            int vow = 0;
            int con = 0;
            int ans = 0;
            int end = 0;
            int size = k * 2;
            while(end < n) {
                if(isVowel(s.charAt(end))) {
                    vow++;
                } else {
                    con++;
                }
                int win = end-start+1;
                while(win >= size) {
                    if(vow == con) {
                        if( (vow * con) % k == 0) {
                            ans++;
                            if(isVowel(s.charAt(start))) {
                                vow--;
                            } else {
                                con--;
                            }
                            start++;
                        }
                    }
                    win = end - start + 1;
                }
                end++;
            }
            return ans;
        }
        static boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }
}
