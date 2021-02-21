package com.zakcorp.final450.string;

import java.util.ArrayList;

public class P_58 {
    static class Solver {
        public int solve1(String str) {
            int n = str.length();
            int zeros = 0, ones = 0, counter = 0;
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) == '0') {
                    zeros++;
                }  else {
                    ones++;
                }
                if(zeros == ones) {
                    counter++;
                }
            }
            return counter;
        }
    }
}
