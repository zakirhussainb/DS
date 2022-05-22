package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_2225_Test {
    Problem_2225.Solver p = new Problem_2225.Solver();
    @Test
    public void test1() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,10));
        list.add(Arrays.asList(4,5,7,8));
        assertEquals(list, p.solve1(new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}}));
    }
    @Test
    public void test2() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,3,4,6));
        list.add(new ArrayList<>());
        assertEquals(list, p.solve1(new int[][]{{1,5},{2,5},{2,8},{2,9},{3,8},{4,7},{4,9},{5,7},{6,8}}));
    }
    @Test
    public void test3() {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,5,6));
        list.add(new ArrayList<>());
        assertEquals(list, p.solve1(new int[][]{{2,3},{1,3},{5,4},{6,4}}));
    }
}
