package com.zakcorp.leetcodemaster;

public class Problem_67 {
    static class Solver {
        /*
        1. Similar to what you do for adding two numbers, same code.
        2. The only change is there you do sum % 10 and here since it is binary, you have to do,
        → sum % 2 and carry as sum / 2
         */
        public String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;
            while(i >= 0 || j >= 0 || carry != 0) {
                int sum = carry;
                if(i >= 0) {
                    sum += a.charAt(i) - '0';
                    i--;
                }
                if(j >= 0){
                    sum += b.charAt(j) - '0';
                    j--;
                }
                sb.insert(0, sum % 2);
                carry = sum / 2;
            }
            return sb.toString();
        }
    }
}
