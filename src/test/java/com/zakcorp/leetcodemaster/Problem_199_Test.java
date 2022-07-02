package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_199_Test {
    Problem_199.Solver p = new Problem_199.Solver();
    Problem_199.Solver1 p1 = new Problem_199.Solver1();
    Problem_199.Solver2 p2 = new Problem_199.Solver2();
    @Test
    public void test1() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.right = new TreeNode(5);
        t1.right.right = new TreeNode(4);
        assertEquals(Arrays.asList(1,3,4), p.rightSideView(t1));
        assertEquals(Arrays.asList(1,3,4), p1.rightSideView(t1));
        assertEquals(Arrays.asList(1,3,4), p2.rightSideView(t1));
//        assertEquals(t2, p.iterative(t2, t2));
    }
    @Test
    public void test2() {
        TreeNode t1 = new TreeNode(10);
        t1.left = new TreeNode(20);
        t1.right = new TreeNode(30);
        t1.left.left = new TreeNode(40);
        t1.left.right = new TreeNode(50);
        t1.right.left = new TreeNode(60);
        t1.right.right = new TreeNode(70);
        assertEquals(Arrays.asList(10,30,70), p.rightSideView(t1));
        assertEquals(Arrays.asList(10,30,70), p1.rightSideView(t1));
        assertEquals(Arrays.asList(10,30,70), p2.rightSideView(t1));
//        assertEquals(t2, p.iterative(t2, t2));
    }
}
