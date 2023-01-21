package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.Arrays;

import org.junit.Test;

public class Problem_1110_Test
{
    Problem_1110.Solver p = new Problem_1110.Solver();
    Problem_1110.Solver1 p1 = new Problem_1110.Solver1();
    @Test
    public void test1() {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(3);
        input.left.left = new TreeNode(4);
        input.left.right = new TreeNode(5);
        input.right.left = new TreeNode(6);
        input.right.right = new TreeNode(7);

        TreeNode op1 = new TreeNode(1);
        op1.left = new TreeNode(2);
        op1.left.left = new TreeNode(4);
//        assertEquals( Arrays.asList(op1, new TreeNode(6), new TreeNode(7)), p.delNodes( input, new int[]{ 3, 5}));
        assertEquals( Arrays.asList(op1, new TreeNode(6), new TreeNode(7)), p1.delNodes( input, new int[]{ 3, 5}));
    }
}
