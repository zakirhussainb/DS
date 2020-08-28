package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Problem_1557_Test {
    Problem_1557.Solver1 p1 = new Problem_1557.Solver1();
    Problem_1557.Solver2 p2 = new Problem_1557.Solver2();
    @Test
    public void test1() {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(Arrays.asList(0, 1));
        mainList.add(Arrays.asList(0, 2));
        mainList.add(Arrays.asList(2, 5));
        mainList.add(Arrays.asList(3, 4));
        mainList.add(Arrays.asList(4, 2));

        assertEquals(Arrays.asList(0, 3), p1.findSmallestSetOfVertices(6, mainList));
        assertEquals(Arrays.asList(0, 3), p2.findSmallestSetOfVertices(6, mainList));
    }
    @Test
    public void test2() {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(Arrays.asList(0, 1));
        mainList.add(Arrays.asList(2, 1));
        mainList.add(Arrays.asList(3, 1));
        mainList.add(Arrays.asList(1, 4));
        mainList.add(Arrays.asList(2, 4));

        assertEquals(Arrays.asList(0, 2, 3), p1.findSmallestSetOfVertices(5, mainList));
        assertEquals(Arrays.asList(0, 2, 3), p2.findSmallestSetOfVertices(5, mainList));
    }
    @Test
    public void test3() {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(Arrays.asList(1, 2));
        mainList.add(Arrays.asList(1, 0));
        mainList.add(Arrays.asList(0, 2));

        assertEquals(Collections.singletonList(1), p1.findSmallestSetOfVertices(3, mainList));
        assertEquals(Collections.singletonList(1), p2.findSmallestSetOfVertices(3, mainList));
    }
    @Test
    public void test4() {
        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(Arrays.asList(1, 2));
        mainList.add(Arrays.asList(3, 2));
        mainList.add(Arrays.asList(1, 3));
        mainList.add(Arrays.asList(1, 0));
        mainList.add(Arrays.asList(0, 2));
        mainList.add(Arrays.asList(0, 3));

        assertEquals(Collections.singletonList(1), p1.findSmallestSetOfVertices(4, mainList));
        assertEquals(Collections.singletonList(1), p2.findSmallestSetOfVertices(4, mainList));
    }
}
