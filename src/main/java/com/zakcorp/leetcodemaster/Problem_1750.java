package com.zakcorp.leetcodemaster;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Problem_1750 {
    static class Solver {
        public String solve1(String str, int key) {
            int al = 26;
            for(int i = 0; i < str.length(); i++) {
                int pos = str.charAt(i) - 'a';
                pos = pos % 26;
                pos = pos + key;

            }
            return "";
        }
    }
}
