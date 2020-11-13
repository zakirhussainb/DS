package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_339 {
    static class Solver {
        // https://leetcode.com/submissions/detail/419841352/
        /*public int depthSum(List<NestedInteger> nestedList) {
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
        }*/
    }
}
