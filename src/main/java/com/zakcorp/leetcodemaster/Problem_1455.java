package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.List;

public class Problem_1455 {
    static class Solver {
        public int isPrefixOfWord(String sentence, String searchWord) {
            String[] split = sentence.split("\\s+");
            for(int i = 0; i < split.length; i++) {
                if(split[i].startsWith(searchWord)) {
                    return i + 1;
                }
            }
            return -1;
        }
    }
}
