package com.zakcorp.leetcodemaster;

public class Problem_2243 {
    static class Solver {
        public String solve1(String str, int k) {
            StringBuilder sb = new StringBuilder(str);
            while(sb.length() > k) {
                StringBuilder temp = new StringBuilder();
                int sum = 0;
                for(int i = 0; i < sb.length(); i++) {
                    sum += sb.charAt(i) - '0';
                    if( (i + 1) % k == 0 || i == sb.length() - 1 ) {
                        temp.append(sum);
                        sum = 0;
                    }
                }
                sb = temp;
            }
            return sb.toString();
        }
    }
}
