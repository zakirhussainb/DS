package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_297_Test {
    Problem_297 p = new Problem_297();
    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String data = "1 2 # # 3 4 # # 5 # #";
//        assertEquals(data, p.serialize(root));
        assertEquals(root, p.deserialize(data));
    }
}
