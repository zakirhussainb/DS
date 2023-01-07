package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public String solve1(int length, int width, int height, int mass) {
            int p4 = 10000;
            long volume = (long)length * width * height;
            boolean isBulky = false;
            boolean isHeavy = false;
            if( length >= p4 || width >= p4 || height >= p4 || mass >= p4 ) {
                isBulky = true;
            } else if(volume >= 1_000_000_000) {
                isBulky = true;
            }
            if(mass >= 100) {
                isHeavy = true;
            }
            if(!isBulky && !isHeavy) {
                return "Neither";
            }
            if(isBulky && isHeavy) {
                return "Both";
            }
            if( isBulky ) {
                return "Bulky";
            }
            return "Heavy";
        }
    }
}
