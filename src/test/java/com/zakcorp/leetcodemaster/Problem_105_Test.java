package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_105_Test {
    Problem_105.Solver p = new Problem_105.Solver();
    @Test
    public void test1() {
        Problem_105.TreeNode root = new Problem_105.TreeNode(3);
        root.left = new Problem_105.TreeNode(9);
        root.right = new Problem_105.TreeNode(20);
        root.right.left = new Problem_105.TreeNode(15);
        root.right.left.right = new Problem_105.TreeNode(7);

        assertEquals(root, p.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
    }
}
