package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import org.junit.Test;

public class Problem_1120_Test
{
    Problem_1120.Solver p = new Problem_1120.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right  = new TreeNode(1);
        assertEquals(6.00000, p.solve1(root), 0);
    }
    @Test
    public void test2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right  = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        assertEquals(2.00000, p.solve1(root), 0);
    }
    @Test
    public void test3() {
        TreeNode root = new TreeNode(2);
        root.right  = new TreeNode(1);
        assertEquals(1.50000, p.solve1(root), 0);
    }
}
