package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_339 {
    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value);

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni);

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    static class Solver {
        // https://leetcode.com/submissions/detail/419841352/
        public int solve1(List<NestedInteger> nestedList) {
            int[] result = {0};
            dfs(nestedList, 1, result);
            return result[0];
        }
        private void dfs(List<NestedInteger> nestedList, int level, int[] result) {
            for(NestedInteger ni : nestedList) {
                if(ni.isInteger()) {
                    result[0] += level * ni.getInteger();
                } else {
                    dfs(ni.getList(), level + 1, result);
                }
            }
        }
    }

    static class Solver1{
        public int solve1(List<NestedInteger> nestedList) {
            return dfs(nestedList, 1);
        }
        private int dfs(List<NestedInteger> list, int depth) {
            int total = 0;
            for (NestedInteger nested: list) {
                if(nested.isInteger()) {
                    total += nested.getInteger() * depth;
                } else {
                    total += dfs(nested.getList(), depth+1);
                }
            }
            return total;
        }
    }
}
