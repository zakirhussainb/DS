package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import org.junit.Test;

public class Problem_2265_Test
{
    Problem_2265.Solver p = new Problem_2265.Solver();
    Problem_2265.Solver1 p1 = new Problem_2265.Solver1();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        assertEquals(3, p.solve1(root));
        assertEquals(3, p1.averageOfSubtree(root));
    }
    @Test
    public void test2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(6);
        assertEquals(5, p.solve1(root));
        assertEquals(5, p1.averageOfSubtree(root));
    }
}
