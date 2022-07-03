package com.zakcorp.leetcodemaster.contest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_A {
    static class Solver {
        public String solve1(String key, String message) {
            Map<Character, Character> map = new HashMap<>();
            int i = 0;
            for(char ch : key.toCharArray()) {
                if(!map.containsKey(ch) && ch != ' ') {
                    map.put(ch, (char)('a' + i) );
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(char ch : message.toCharArray()) {
                if(map.containsKey(ch)) {
                    sb.append(map.get(ch));
                } else if(ch == ' ') {
                    sb.append(' ');
                }
            }
            return sb.toString();
        }
    }
}
