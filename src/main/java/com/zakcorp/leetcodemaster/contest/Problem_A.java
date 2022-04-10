package com.zakcorp.leetcodemaster.contest;


public class Problem_A {
    static class Solver {
        public int solve1(int num) {
            String str = Integer.toString(num);
            StringBuilder sb = new StringBuilder(str);
            int maxSum = 0;
            for(int i = 0; i < sb.length(); i++) {
                for(int j = i + 1; j < sb.length(); j++) {
                    int x = sb.charAt(i) - '0';
                    int y = sb.charAt(j) - '0';
                    if( ( isEven(x) && isEven(y) ) || ( isOdd(x) && isOdd(y) ) ) {
                        if(y > x) {
                            char temp = sb.charAt(i);
                            sb.setCharAt(i, sb.charAt(j));
                            sb.setCharAt(j, temp);
                        }
                    }
                }
            }
            return Integer.parseInt(sb.toString());
        }
        private boolean isOdd(int num) {
            return num % 2 != 0;
        }
        private boolean isEven(int num) {
            return num % 2 == 0;
        }
    }
}
