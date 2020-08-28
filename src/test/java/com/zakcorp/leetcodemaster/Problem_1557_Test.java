package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Problem_1557_Test {
    Problem_1557.Solver p = new Problem_1557.Solver();
    @Test
    public void test1() {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(Arrays.asList(0, 1));
        mainList.add(Arrays.asList(0, 2));
        mainList.add(Arrays.asList(2, 5));
        mainList.add(Arrays.asList(3, 4));
        mainList.add(Arrays.asList(4, 2));
        assertEquals(Arrays.asList(0, 3), p.findSmallestSetOfVertices(6, mainList));
    }
    @Test
    public void test2() {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(Arrays.asList(0, 1));
        mainList.add(Arrays.asList(2, 1));
        mainList.add(Arrays.asList(3, 1));
        mainList.add(Arrays.asList(1, 4));
        mainList.add(Arrays.asList(2, 4));
        assertEquals(Arrays.asList(0, 2, 3), p.findSmallestSetOfVertices(5, mainList));
    }
}
