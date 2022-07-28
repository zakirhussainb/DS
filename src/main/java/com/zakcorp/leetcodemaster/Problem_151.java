package com.zakcorp.leetcodemaster;

public class Problem_151 {
    static class Solver {
        public String reverseWords(String str) {
            String[] splitArr = str.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i = splitArr.length - 1; i >= 0; i--) {
                if(!splitArr[i].isEmpty()) {
                    sb.append(splitArr[i]);
                    sb.append(" ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }
}
