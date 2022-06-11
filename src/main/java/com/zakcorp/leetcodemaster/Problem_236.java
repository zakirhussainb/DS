package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_236 {
    static class Solver {
        public TreeNode solve1(TreeNode root, TreeNode p, TreeNode q) {
            Map<TreeNode, TreeNode> parentMap = new HashMap<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            parentMap.put(root, null);
            while( !parentMap.containsKey(p) || !parentMap.containsKey(q) ) {
                TreeNode curr = queue.poll();
                if (curr.left != null) {
                    parentMap.put(curr.left, curr);
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    parentMap.put(curr.right, curr);
                    queue.add(curr.right);
                }
            }
            Set<TreeNode> ancestorSet = new HashSet<>();
            while(p != null) {
                ancestorSet.add(p);
                p = parentMap.get(p);
            }
            while(!ancestorSet.contains(q)) {
                q = parentMap.get(q);
            }
            return q;
        }
        /*
        Recursive approach:
         */
        public TreeNode solve2(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q) {
                return root;
            }
            TreeNode left = solve2(root.left, p, q);
            TreeNode right = solve2(root.right, p, q);
            if(left != null && right != null)
                return root;
            if(left == null && right == null)
                return null;
            return left == null ? right : left;
        }
    }
}
