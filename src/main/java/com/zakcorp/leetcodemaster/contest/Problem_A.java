package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public String solve1(String caption) {
            caption = caption.trim();
            StringBuilder sb = new StringBuilder();
            String[] split = caption.split(" ");
            if(split.length < 1) {
                return "#";
            }
            sb.append("#");
            for(int i=0;i<split.length;i++){
                if(split[i].isEmpty()) {
                    continue;
                }
                split[i] = split[i].toLowerCase();
                StringBuilder sb1 = new StringBuilder(split[i]);
                if(sb.length() > 1) {
                    char firstChar = sb1.charAt(0);
                    char uppercaseChar = Character.toUpperCase(firstChar);
                    sb1.setCharAt(0, uppercaseChar);
                }
                sb.append(sb1);
            }
            if(sb.length() > 100) {
                return sb.substring(0, 100);
            } else {
                return sb.toString();
            }
        }
    }
}
