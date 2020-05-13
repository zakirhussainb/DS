package com.zakcorp.leetcodemaster;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem_1342 {
    static class Solver {
        public int numberOfSteps (int num) {
            int[] counter = {0};
            recurSteps(num, counter);
            return counter[0];
        }
        private void recurSteps(int num, int[] counter) {
            if(num > 0) {
                if(isEven(num)) {
                    num = num / 2;
                } else {
                    num = num - 1;
                }
                counter[0]++;
                recurSteps(num, counter);
            }
        }
        private boolean isEven(int num){
            return num % 2 == 0;
        }
    }
    static class Solver1 {
        public int numberOfSteps (int num) {
            if(num == 0){
                return 0;
            }
            return num % 2 == 0 ? 1 + numberOfSteps(num/2) : 1 + numberOfSteps(num -= 1);
        }
    }
    static class Solver2 {
        public int numberOfSteps(int num) {
            int steps = 0;
            while(num != 0) {
                if(num % 2 == 0){
                    num /= 2;
                } else {
                    num -= 1;
                }
                steps++;
            }
            return steps;
        }
    }
    static class Solver3 {
        public int numberOfSteps(int num) {
            if(num == 0)
                return 0;
            int steps = 0;
            while(num > 0) {
                steps += ( (num & 1) == 1) ? 2 : 1;
                num >>= 1;
            }
            return steps - 1;
        }
    }
}
