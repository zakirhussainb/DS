package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem_105 {
    // Basic principle
    // The root of the tree is the first element in preorder array.
    // Identify its index in the inorder array.
    // Elements in the left of index form the left subtree and elements towards the right of the index form right subtree
    static class Solver {
        private int preorderIndex  = 0;
        private int[] preorder;
        Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            for(int i = 0; i < inorder.length; i++) {
                inOrderIndexMap.put(inorder[i], i);
            }
            return dfs(0, inorder.length);
        }
        private TreeNode dfs(int left, int right) {
            if(left == right) {
                return null;
            }
            int rootVal = preorder[preorderIndex];
            TreeNode root = new TreeNode(rootVal);
            int inOrderIndex = inOrderIndexMap.get(rootVal);

            preorderIndex++;

            root.left = dfs(left, inOrderIndex);
            root.right = dfs(inOrderIndex + 1, right);
            return root;
        }
    }
}
