package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_617_Test {
    Problem_617 p = new Problem_617();
    @Test
    public void test1() {
        Problem_617.TreeNode t1 = new Problem_617.TreeNode(1);
        t1.left = new Problem_617.TreeNode(3);
        t1.right = new Problem_617.TreeNode(2);
        t1.left.left = new Problem_617.TreeNode(5);

        Problem_617.TreeNode t2 = new Problem_617.TreeNode(2);
        t2.left = new Problem_617.TreeNode(1);
        t2.right = new Problem_617.TreeNode(3);
        t2.left.right = new Problem_617.TreeNode(4);
        t2.right.right = new Problem_617.TreeNode(7);
        Problem_617.Solver p = new Problem_617.Solver();
//        assertEquals(t1, p.recursive(t1, t2));
        assertEquals(t1, p.iterative(t1, t2));
    }
}
