package com.zakcorp.leetcodemaster;

import com.zakcorp.trees.bst.BinarySearchTree;

import java.util.HashMap;
import java.util.Map;

public class Problem_700 {
    static class Solver {
        public BinarySearchTree.TreeNode solve1(BinarySearchTree.TreeNode root, int val) {
            if(root == null) {
                return null;
            }
            if(root.data == val) {
                return root;
            } else if(root.data < val) {
                return solve1(root.right, val);
            } else {
                return solve1(root.left, val);
            }
        }
        public BinarySearchTree.TreeNode solve2(BinarySearchTree.TreeNode root, int val) {
            if(root == null) {
                return null;
            }
            BinarySearchTree.TreeNode p = root;
            while(p != null) {
                if(p.data == val) {
                    return p;
                } else if(p.data < val) {
                    p = p.right;
                } else {
                    p = p.left;
                }
            }
            return null;
        }
    }
}
