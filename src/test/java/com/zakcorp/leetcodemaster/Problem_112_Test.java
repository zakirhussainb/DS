package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem_112_Test {
    Problem_112.Solver p = new Problem_112.Solver();
    Problem_112.TreeNode t1;
    @Test
    public void test1_recursive() {
        t1 = new Problem_112.TreeNode(5);
        t1.left = new Problem_112.TreeNode(4);
        t1.right = new Problem_112.TreeNode(8);
        t1.left.left = new Problem_112.TreeNode(11);
        t1.right.left = new Problem_112.TreeNode(13);
        t1.right.right = new Problem_112.TreeNode(4);
        t1.left.left.left = new Problem_112.TreeNode(7);
        t1.left.left.right = new Problem_112.TreeNode(2);
        t1.right.right.right = new Problem_112.TreeNode(1);
        assertTrue(p.preOrderRecursive(t1, 22));
    }
    @Test
    public void test2_recursive() {
        t1 = new Problem_112.TreeNode(1);
        t1.left = new Problem_112.TreeNode(2);
        assertFalse(p.preOrderRecursive(t1, 1));
    }
    @Test
    public void test1_iterative() {
        t1 = new Problem_112.TreeNode(5);
        t1.left = new Problem_112.TreeNode(4);
        t1.right = new Problem_112.TreeNode(8);
        t1.left.left = new Problem_112.TreeNode(11);
        t1.right.left = new Problem_112.TreeNode(13);
        t1.right.right = new Problem_112.TreeNode(4);
        t1.left.left.left = new Problem_112.TreeNode(7);
        t1.left.left.right = new Problem_112.TreeNode(2);
        t1.right.right.right = new Problem_112.TreeNode(1);
        assertTrue(p.preOrderIterative(t1, 22));
    }
    @Test
    public void test2_iterative() {
        t1 = new Problem_112.TreeNode(1);
        t1.left = new Problem_112.TreeNode(2);
        assertFalse(p.preOrderIterative(t1, 1));
    }
}
