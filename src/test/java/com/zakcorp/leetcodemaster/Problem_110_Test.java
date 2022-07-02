package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_110_Test {
    Problem_110.Solver p = new Problem_110.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(25);
        root.left.left = new TreeNode(30);
        root.left.right = new TreeNode(35);
        root.left.left.left = new TreeNode(40);
        root.left.left.right = new TreeNode(45);
        assertFalse(p.isBalanced(root));
    }
}
