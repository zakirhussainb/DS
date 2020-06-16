package com.zakcorp.leetcodemaster;

public class Problem_58 {
    static class Solver {
        public int lengthOfLastWord(String str) {
            str = str.trim();
            if(str.isEmpty()) {
                return 0;
            }
            String[] splitArr = str.split("\\s+");
            return splitArr[splitArr.length - 1].length();
        }
    }
    static class Solver1 {
        public int lengthOfLastWord(String str) {
            if(str.isEmpty() || str.equals(" ")) {
                return 0;
            }
            String[] splitArr = str.split("\\s+");
            if(splitArr.length > 0) {
                return splitArr[splitArr.length - 1].length();
            }
            return 0;
        }
    }

}
