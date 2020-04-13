package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_728 {
    static class Solver {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> list = new ArrayList<>();
            for(int i = left; i <= right; i++) {
                if(isSelfDividingNum(i)) {
                    list.add(i);
                }
            }
            return list;
        }
        public boolean isSelfDividingNum(int num) {
            int orgNo = num;
            while(num > 0) {
                int rem = num % 10;
                if(rem == 0 || orgNo % rem != 0){
                    return false;
                }
                num /= 10;
            }
            return true;
        }
    }
}
