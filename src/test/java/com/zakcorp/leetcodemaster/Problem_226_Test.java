package com.zakcorp.leetcodemaster;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_226_Test {
    Problem_226.Solver p = new Problem_226.Solver();
    Problem_226.TreeNode t1 = new Problem_226.TreeNode(1);
    Problem_226.TreeNode t2 = null;
    @Before
    public void setup() {
        t1.left = new Problem_226.TreeNode(2);
        t1.right = new Problem_226.TreeNode(7);
        t1.left.left = new Problem_226.TreeNode(1);
        t1.left.right = new Problem_226.TreeNode(3);
        t1.right.left = new Problem_226.TreeNode(6);
        t1.right.right = new Problem_226.TreeNode(9);

        t2 = t1;
        t2.left = new Problem_226.TreeNode(7);
        t2.right = new Problem_226.TreeNode(2);
        t2.left.left = new Problem_226.TreeNode(9);
        t2.left.right = new Problem_226.TreeNode(6);
        t2.right.left = new Problem_226.TreeNode(3);
        t2.right.right = new Problem_226.TreeNode(1);
    }
    @Test
    public void test1_recursive() {
        assertEquals(t2, p.recursive(t1));
    }
    @Test
    public void test1_iterative() {
        assertEquals(t2, p.iterative(t1));
    }

}
