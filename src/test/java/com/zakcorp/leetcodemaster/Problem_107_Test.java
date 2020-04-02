package com.zakcorp.leetcodemaster;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_107_Test {
    Problem_107.Solver p = new Problem_107.Solver();
    @Test
    public void test1() {
        Problem_107.TreeNode t1 = new Problem_107.TreeNode(3);
        t1.left = new Problem_107.TreeNode(9);
        t1.right = new Problem_107.TreeNode(20);
        t1.right.left = new Problem_107.TreeNode(15);
        t1.right.right = new Problem_107.TreeNode(7);

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(15);list.add(7);
        resultList.add(list);
        list = new ArrayList<>();
        list.add(9);list.add(20);
        resultList.add(list);
        list = new ArrayList<>();
        list.add(3);
        resultList.add(list);
        Problem_107.Solver p = new Problem_107.Solver();
        assertEquals(resultList, p.levelOrderBottomUsingLinkedList(t1));
//        assertEquals(resultList, p.levelOrderBottomUsingArrayList(t1));
//        assertEquals(resultList, p.levelOrderBottomUsingHashing(t1));
    }
}
