package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem_230 {
    static class Solver {
        private int ans = 0;
        private int count = 0;
        public int dfsRecursive(TreeNode root, int k) {
            count = k;
            inorder(root);
            return ans;
        }
        private void inorder(TreeNode root) {
            if(root == null)
                return;
            inorder(root.left);
            count--;
            if(count == 0) {
                ans = root.val;
                return;
            }
            inorder(root.right);
        }
    }
}
