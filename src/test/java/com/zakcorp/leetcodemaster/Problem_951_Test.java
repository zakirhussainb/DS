package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import org.junit.Test;

public class Problem_951_Test
{
    Problem_951.Solver p = new Problem_951.Solver();
    Problem_951.Solver1 p1 = new Problem_951.Solver1();
    @Test
    public void test1() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(8);
        root1.right.left = new TreeNode(6);


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(6);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(5);
        root2.right.right.left = new TreeNode(8);
        root2.right.right.right = new TreeNode(7);

        assertTrue(p.solve1(root1, root2));
        assertTrue(p1.solve1(root1, root2));
    }

    @Test
    public void test2() {
        TreeNode root1 = new TreeNode(6);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(0);

        TreeNode root2 = new TreeNode(6);
        root2.right = new TreeNode(1);

        assertFalse(p.solve1(root1, root2));
        assertFalse(p1.solve1(root1, root2));
    }
}
