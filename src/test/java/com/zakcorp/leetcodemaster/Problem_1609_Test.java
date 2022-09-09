package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import org.junit.Test;

public class Problem_1609_Test
{
    Problem_1609.Solver p = new Problem_1609.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.left.left = new TreeNode(12);
        root.right.left.left = new TreeNode(6);
        root.right.right.right = new TreeNode(2);
        assertTrue(p.solve1(root));
        assertTrue(p.solve2(root));
    }
}
