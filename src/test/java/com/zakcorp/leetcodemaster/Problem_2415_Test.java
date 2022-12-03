package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import org.junit.Test;

public class Problem_2415_Test
{
    Problem_2415.Solver p = new Problem_2415.Solver();
    Problem_2415.Solver1 p1 = new Problem_2415.Solver1();
    @Test
    public void test1() {
        TreeNode root = new TreeNode( 2 );
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);
//        TreeNode s = p.solve1(root);
        TreeNode s1 = p1.solve1(root);
        System.out.println(s1);
    }
}
