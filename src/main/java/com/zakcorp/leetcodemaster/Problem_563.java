package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_563 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    static class Solver {
        public int solve1(TreeNode root) {
            if(root == null) {
                return 0;
            }
            int[] sum = {0};
            dfs(root.left, root.right, sum);
            return sum[0];
        }
        private void dfs(TreeNode t1, TreeNode t2, int[] sum) {
            //base conditions
            if(t1 == null) {
                return;
            }
            if(t2 == null) {
                return;
            }
            sum[0] += Math.abs(t1.val - t2.val);
            dfs(t1.left, t2.left, sum);
            dfs(t1.right, t2.right, sum);
        }
    }
}
