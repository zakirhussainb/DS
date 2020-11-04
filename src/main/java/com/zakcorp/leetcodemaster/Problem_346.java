package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_346 {
    static class Solver {
        int limit;
        double sum;
        LinkedList<Integer> list;
        public Solver(int size) {
            sum = 0;
            limit = size;
            list = new LinkedList<>();
        }
        public double next(int val) {
            if(list.size() == limit) {
                sum = sum - list.remove();
            }
            list.add(val);
            sum += val;
            return sum / list.size();
        }
    }
}
