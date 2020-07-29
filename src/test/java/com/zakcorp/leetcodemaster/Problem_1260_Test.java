package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Problem_1260_Test {
    Problem_1260.Solver p = new Problem_1260.Solver();
    @Test
    public void test1() {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(9, 1, 2));
        resultList.add(Arrays.asList(3, 4, 5));
        resultList.add(Arrays.asList(6, 7, 8));
        assertEquals(resultList, p.solve1(new int[][]{ {1,2,3}, {4,5,6}, {7,8,9} }, 1));
        assertEquals(resultList, p.solve2(new int[][]{ {1,2,3}, {4,5,6}, {7,8,9} }, 1));
    }

    @Test
    public void test2() {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(12, 0, 21, 13));
        resultList.add(Arrays.asList(3, 8, 1, 9));
        resultList.add(Arrays.asList(19, 7, 2, 5));
        resultList.add(Arrays.asList(4, 6, 11, 10));
        assertEquals(resultList, p.solve1(new int[][]{ {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13} }, 4));
        assertEquals(resultList, p.solve2(new int[][]{ {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13} }, 4));
    }

    @Test
    public void test3() {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(1, 2, 3));
        resultList.add(Arrays.asList(4, 5, 6));
        resultList.add(Arrays.asList(7, 8, 9));
        assertEquals(resultList, p.solve1(new int[][]{ {1,2,3}, {4,5,6}, {7,8,9} }, 9));
        assertEquals(resultList, p.solve2(new int[][]{ {1,2,3}, {4,5,6}, {7,8,9} }, 9));
    }
}
