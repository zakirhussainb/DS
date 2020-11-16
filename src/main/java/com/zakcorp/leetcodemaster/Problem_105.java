package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_105 {
    // Basic principle
    // The root of the tree is the first element in preorder array.
    // Identify its index in the inorder array.
    // Elements in the left of index form the left subtree and elements towards the right of the index form right subtree
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    static class Solver {
        private int preIndex  = 0;
        private int[] preorder;
        private int[] inorder;
        Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            this.inorder = inorder;
            for(int i = 0; i < inorder.length; i++) {
                inOrderIndexMap.put(inorder[i], i);
            }
            return dfs(0, inorder.length);
        }
        private TreeNode dfs(int left, int right) {
            if(left == right) {
                return null;
            }
            int rootVal = preorder[preIndex];
            TreeNode root = new TreeNode(rootVal);
            int inOrderIndx = inOrderIndexMap.get(rootVal);

            preIndex++;

            root.left = dfs(left, inOrderIndx);
            root.right = dfs(inOrderIndx + 1, right);
            return root;
        }
    }
}
