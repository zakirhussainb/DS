package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_429_Test {
    @Test
    public void test1() {

        Problem_429.Node root = new Problem_429.Node(1);

        List<Problem_429.Node> nodeList = new ArrayList<>();
        nodeList.add(new Problem_429.Node(3));
        nodeList.add(new Problem_429.Node(2));
        nodeList.add(new Problem_429.Node(4));
        root.children = nodeList;

//        root.children.add(new ArrayList<Integer>(Arrays.asList(3,2,4)));


        Problem_429.Solver p = new Problem_429.Solver();
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>(Arrays.asList(1)));
        resultList.add(new ArrayList<>(Arrays.asList(3,2,4)));
        resultList.add(new ArrayList<>(Arrays.asList(5,6)));
//        assertEquals(resultList, p.levelOrder(t1));
    }

}
