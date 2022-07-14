package com.zakcorp.leetcodemaster.classes;

import java.util.ArrayList;
import java.util.List;

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
}
