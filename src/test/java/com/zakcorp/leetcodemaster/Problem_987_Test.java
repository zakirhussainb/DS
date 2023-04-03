package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Problem_987_Test
{
    Problem_987.Solver p = new Problem_987.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode( 1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        List<List<Integer>> ls = p.solve1( root );
        System.out.println(ls.toString());
    }
}
