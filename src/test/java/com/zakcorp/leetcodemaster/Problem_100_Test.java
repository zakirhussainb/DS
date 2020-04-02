package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_100_Test {
    Problem_100.Solver p = new Problem_100.Solver();
    @Test
    public void test1() {
        Problem_100.TreeNode t1 = new Problem_100.TreeNode(1);
        t1.left = new Problem_100.TreeNode(2);
        t1.right = new Problem_100.TreeNode(7);
        t1.left.left = new Problem_100.TreeNode(1);
        t1.left.right = new Problem_100.TreeNode(3);
        t1.right.left = new Problem_100.TreeNode(6);
        t1.right.right = new Problem_100.TreeNode(9);

        Problem_100.TreeNode t2 = new Problem_100.TreeNode(1);
        t2.left = new Problem_100.TreeNode(2);
        t2.right = new Problem_100.TreeNode(7);
        t2.left.left = new Problem_100.TreeNode(1);
        t2.left.right = new Problem_100.TreeNode(3);
        t2.right.left = new Problem_100.TreeNode(6);
        t2.right.right = new Problem_100.TreeNode(9);

        Problem_100.Solver p = new Problem_100.Solver();
        assertTrue(p.recursive(t1, t2));
        assertTrue(p.iterative(t1, t2));
//        assertEquals(t2, p.iterative(t2, t2));
    }
}
