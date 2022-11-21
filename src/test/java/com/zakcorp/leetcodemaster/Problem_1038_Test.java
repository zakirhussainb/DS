package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import org.junit.Test;

public class Problem_1038_Test
{
    Problem_1038.Solver p = new Problem_1038.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);

        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        assertNull( p.solve1( root ) );
    }
}
