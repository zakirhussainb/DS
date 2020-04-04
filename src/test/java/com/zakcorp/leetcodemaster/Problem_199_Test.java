package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_199_Test {
    Problem_199.Solver p = new Problem_199.Solver();
    @Test
    public void test1() {
        Problem_199.TreeNode t1 = new Problem_199.TreeNode(1);
        t1.left = new Problem_199.TreeNode(2);
        t1.right = new Problem_199.TreeNode(3);
        t1.left.right = new Problem_199.TreeNode(5);
        t1.right.right = new Problem_199.TreeNode(4);
        assertEquals(Arrays.asList(1,3,4), p.rightSideView(t1));
//        assertEquals(t2, p.iterative(t2, t2));
    }
}
