package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import java.util.List;

import static com.zakcorp.leetcodemaster.classes.TreeNode.preorder;
import static org.junit.Assert.*;

public class Problem_105_Test {
    Problem_105.Solver p = new Problem_105.Solver();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.left.right = new TreeNode(7);
        List<Integer> expectedPreOrderTraversal = preorder(root);
        List<Integer> actualPreOrderTraversal = preorder(p.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7}));
        assertEquals(expectedPreOrderTraversal, actualPreOrderTraversal);
    }
}
