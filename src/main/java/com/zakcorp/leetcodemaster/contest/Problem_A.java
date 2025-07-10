package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public List<List<Integer>> solve1(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);
            combsum(0, candidates, target, new ArrayList<>(), result);
            return result;
        }
        private static void combsum(int index, int[] candidates, int target, List<Integer> list, List<List<Integer>> result) {
            if(target == 0) {
                result.add(new ArrayList<>(list));
                return;
            }
            if(index >= candidates.length || target < 0) {
                return;
            }
            list.add(candidates[index]);
            combsum(index + 1, candidates, target - candidates[index], list, result);
            list.remove(list.size() - 1);
            combsum(index + 1, candidates, target, list, result);
        }
    }
}
