package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_94_Test {
    Problem_94.Solver p = new Problem_94.Solver();
    Problem_94.Solver1 p1 = new Problem_94.Solver1();
    @Test
    public void test1() {
        Problem_94.TreeNode root = new Problem_94.TreeNode(1);
        root.right = new Problem_94.TreeNode(2);
        root.right.left = new Problem_94.TreeNode(3);
        assertEquals(Arrays.asList(1,3,2), p.solve(root));
        assertEquals(Arrays.asList(1,3,2), p1.solve(root));
    }
}
