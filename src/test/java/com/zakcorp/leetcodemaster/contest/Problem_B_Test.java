package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        Problem_B.TreeNode t = new Problem_B.TreeNode(4);
        t.left = new Problem_B.TreeNode(8);
        t.left.left = new Problem_B.TreeNode(0);
        t.left.right = new Problem_B.TreeNode(1);
        t.right = new Problem_B.TreeNode(5);
        t.right.right = new Problem_B.TreeNode(6);
        assertEquals( 5, p.solve1(t));
    }

    @Test
    public void test2() {
        Problem_B.TreeNode t = new Problem_B.TreeNode(1);
        assertEquals( 1, p.solve1(t));
    }
}
