package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_236_Test {
    Problem_236.Solver p = new Problem_236.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

//        assertEquals(root, p.solve1(root, root.left, root.right));
        assertEquals(root, p.solve2(root, root.left, root.right));
    }
}
