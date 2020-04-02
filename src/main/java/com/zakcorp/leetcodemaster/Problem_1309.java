package com.zakcorp.leetcodemaster;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem_1309 {
    static class Solver {
        public String freqAlphabets(String str) {
            String[] splitArr = str.split("");
            StringBuilder sb = new StringBuilder();
            int n = splitArr.length;
            int i = n - 1;
            while(i >= 0) {
                String searchStr;
                if(splitArr[i].equals("#")){
                    searchStr = splitArr[i - 2] + splitArr[i - 1] + splitArr[i];
                    i = i - 3;
                } else {
                    searchStr = splitArr[i];
                    i--;
                }
                sb.append(getAlphabetFromInteger(searchStr));
            }
            return sb.reverse().toString();
        }
        public Character getAlphabetFromInteger(String s) {
            Map<String, Character> map = new LinkedHashMap<>();
            map.put("1", 'a');
            map.put("2", 'b');
            map.put("3", 'c');
            map.put("4", 'd');
            map.put("5", 'e');
            map.put("6", 'f');
            map.put("7", 'g');
            map.put("8", 'h');
            map.put("9", 'i');
            map.put("10#", 'j');
            map.put("11#", 'k');
            map.put("12#", 'l');
            map.put("13#", 'm');
            map.put("14#", 'n');
            map.put("15#", 'o');
            map.put("16#", 'p');
            map.put("17#", 'q');
            map.put("18#", 'r');
            map.put("19#", 's');
            map.put("20#", 't');
            map.put("21#", 'u');
            map.put("22#", 'v');
            map.put("23#", 'w');
            map.put("24#", 'x');
            map.put("25#", 'y');
            map.put("26#", 'z');
            return map.get(s);
        }
    }
}
