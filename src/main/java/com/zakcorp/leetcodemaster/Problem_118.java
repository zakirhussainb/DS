package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_118 {
    static class Solver {
        public List<List<Integer>> solve1(int numRows) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>(List.of(1)));
            res.add(new ArrayList<>(Arrays.asList(1,1)));
            for(int i = 2; i < numRows; i++) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                List<Integer> ll = res.get(res.size() - 1);
                for(int j = 1; j < ll.size(); j++) {
                    int sum = ll.get(j - 1) + ll.get(j);
                    list.add(sum);
                }
                list.add(1);
                res.add(list);
            }
            return res;
        }
    }
}
