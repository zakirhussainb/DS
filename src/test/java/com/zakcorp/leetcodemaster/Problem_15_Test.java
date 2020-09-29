package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Problem_15_Test {
    Problem_15.Solver p = new Problem_15.Solver();
    @Test
    public void test1() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-1,-1,2));
        output.add(Arrays.asList(-1,0,1));
        assertEquals(output, p.solve1(new int[]{-1,0,1,2,-1,-4}));
        assertEquals(output, p.solve2(new int[]{-1,0,1,2,-1,-4}));
    }
    @Test
    public void test2() {
        List<List<Integer>> output = new ArrayList<>();
        assertEquals(output, p.solve1(new int[]{0}));
        assertEquals(output, p.solve2(new int[]{0}));
    }
    @Test
    public void test3() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(0,0,0));
        assertEquals(output, p.solve1(new int[]{0,0,0,0}));
        assertEquals(output, p.solve2(new int[]{0,0,0,0}));
    }
    @Test
    public void test4() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-2,0,2));
        assertEquals(output, p.solve1(new int[]{-2,0,0,2,2}));
        assertEquals(output, p.solve2(new int[]{-2,0,0,2,2}));
    }
}
