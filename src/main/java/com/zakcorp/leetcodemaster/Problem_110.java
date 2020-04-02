package com.zakcorp.leetcodemaster;

public class Problem_110 {
    static class Solver {
        boolean isBalanced = true;
        static class TreeNode {
            TreeNode left;
            int val;
            TreeNode right;
            public TreeNode(int val){
                this.val = val;
            }
        }
        public boolean isBalanced(TreeNode root) {
            if(root == null)
                return isBalanced;
            postOrderRecursive(root);
            return isBalanced;
        }
        public int postOrderRecursive(TreeNode root) {
            if(root != null) {
                int x = postOrderRecursive(root.left);
                int y = postOrderRecursive(root.right);
                int sub = Math.abs(x - y);
                if (sub > 1) {
                    isBalanced = false;
                }
                return Math.max(x, y) + 1;
            }
            return 0;
        }
    }
}
