package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class Problem_114_Test {
    Problem_114.Solver p = new Problem_114.Solver();
    @Test
    public void test1() {
        Problem_114.TreeNode root = new Problem_114.TreeNode(1);
        root.left = new Problem_114.TreeNode(2);
        root.right = new Problem_114.TreeNode(5);
        root.left.left = new Problem_114.TreeNode(3);
        root.left.right = new Problem_114.TreeNode(4);
        root.right.right = new Problem_114.TreeNode(6);
        p.solve(root);
        p.preOrderPrint(root);
    }
}
