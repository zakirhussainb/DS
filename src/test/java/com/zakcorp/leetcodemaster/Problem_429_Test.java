package com.zakcorp.leetcodemaster;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_429_Test {
    Problem_429.Solver solver = new Problem_429.Solver();
    Problem_429.Node one;
    @Before
    public void setup() {
        one = new Problem_429.Node(1);
        Problem_429.Node three = new Problem_429.Node(3);
        List<Problem_429.Node> threeChildren = new ArrayList<>();
        threeChildren.add(new Problem_429.Node(5));
        threeChildren.add(new Problem_429.Node(6));
        three.children = threeChildren;
        List<Problem_429.Node> oneChildren = new ArrayList<>();
        oneChildren.add(three);
        oneChildren.add(new Problem_429.Node(2));
        oneChildren.add(new Problem_429.Node(4));
        one.children = oneChildren;
    }
    @Test
    public void test1() {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        resultList.add(list);
        list = new ArrayList<>();
        list.add(3); list.add(2); list.add(4);
        resultList.add(list);
        list = new ArrayList<>();
        list.add(5); list.add(6);
        resultList.add(list);
        assertEquals(resultList, solver.levelOrder(one));
    }

}
