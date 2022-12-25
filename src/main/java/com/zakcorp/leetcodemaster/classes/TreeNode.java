package com.zakcorp.leetcodemaster.classes;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static List<Integer> preorder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        preorder(root, list);
        return list;
    }

    private static void preorder(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    // TODO : This code gives wrong output, Need to work on it.
    /*public void constructTree(TreeNode root, int rootIndex, Integer[] data) {
        int n = data.length;

        int leftIndex = 2 * rootIndex + 1;
        if(leftIndex < n && data[leftIndex] != null) {
            root.left = new TreeNode(data[leftIndex]);
            constructTree( root.left, leftIndex, data );
        }

        int rightIndex = 2 * rootIndex + 2;
        if(rightIndex < n && data[rightIndex] != null) {
            root.right = new TreeNode(data[rightIndex]);
            constructTree( root.right, rightIndex, data );
        }
    }*/
}
