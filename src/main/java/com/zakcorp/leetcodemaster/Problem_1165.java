package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1165 {
    static class Solver {
        public int solve1(String keyboard, String word) {
            int time = 0;
            int index = 0;
            for(int i = 0; i < word.length(); i++) {
                char w = word.charAt(i);
                for(int j = 0; j < keyboard.length(); j++) {
                    if(w == keyboard.charAt(j)) {
                        time += Math.abs(index - j);
                        index = j;
                        break;
                    }
                }
            }
            return time;
        }
    }
}
