package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1309 {
    static class Solver {
        public String freqAlphabets(String str) {
            char[] charArr = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            int n = charArr.length;
            int i = n - 1;
            while(i >= 0) {
                String searchStr = "";
                char curr = charArr[i];
                if(curr == '#'){
                    searchStr += charArr[i - 2];
                    searchStr += charArr[i - 1];
                    searchStr += charArr[i];
                    i = i - 3;
                } else {
                    searchStr += charArr[i];
                    i--;
                }
                sb.append(getAlphabetFromInteger(searchStr));
            }
            return sb.reverse().toString();
        }
        public String getAlphabetFromInteger(String s) {
            Map<String, String> map = new HashMap<>();
            map.put("1", "a");
            map.put("2", "b");
            map.put("3", "c");
            map.put("4", "d");
            map.put("5", "e");
            map.put("6", "f");
            map.put("7", "g");
            map.put("8", "h");
            map.put("9", "i");
            map.put("10#", "j");
            map.put("11#", "k");
            map.put("12#", "l");
            map.put("13#", "m");
            map.put("14#", "n");
            map.put("15#", "o");
            map.put("16#", "p");
            map.put("17#", "q");
            map.put("18#", "r");
            map.put("19#", "s");
            map.put("20#", "t");
            map.put("21#", "u");
            map.put("22#", "v");
            map.put("23#", "w");
            map.put("24#", "x");
            map.put("25#", "y");
            map.put("26#", "z");
            return map.get(s);
        }
    }
}
