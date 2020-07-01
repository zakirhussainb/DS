package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_970 {
    static class Solver {
        public List<Integer> powerfulIntegers(int x, int y, int bound) {
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < 20; i++) {
                for(int j = 0; j < 20; j++) {
                    int value = (int)Math.pow(x, i) + (int)Math.pow(y, j);
                    if(value <= bound && value > 0) {
                        set.add(value);
                    } else {
                        break;
                    }
                }
            }
            return new ArrayList<>(set);
        }
    }
}
