package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_543_Test {
    Problem_543.Solver p = new Problem_543.Solver();
    @Test
    public void test1() {
        Problem_543.TreeNode root = new Problem_543.TreeNode(1);
        root.left = new Problem_543.TreeNode(2);
        root.right = new Problem_543.TreeNode(3);
        root.left.right = new Problem_543.TreeNode(4);
        root.right.left = new Problem_543.TreeNode(5);
        root.right.right = new Problem_543.TreeNode(6);
        root.right.left.left = new Problem_543.TreeNode(7);
        root.right.left.right = new Problem_543.TreeNode(8);
        assertEquals(6, p.diameterOfBinaryTree(root));
    }
    @Test
    public void test2() {
        Problem_543.TreeNode root = new Problem_543.TreeNode(1);
        root.left = new Problem_543.TreeNode(2);
        root.right = new Problem_543.TreeNode(3);
        root.left.left = new Problem_543.TreeNode(4);
        root.left.right = new Problem_543.TreeNode(5);
        assertEquals(3, p.diameterOfBinaryTree(root));
    }
}
