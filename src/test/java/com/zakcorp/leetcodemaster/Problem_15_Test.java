package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Problem_15_Test {
    Problem_15.Solver p = new Problem_15.Solver();
    Problem_15.Solver1 p1 = new Problem_15.Solver1();
    Problem_15.Solver2 p2 = new Problem_15.Solver2();
    @Test
    public void test1() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-1, 2, -1));
        output.add(Arrays.asList(0, 1, -1));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve1(new int[]{-1,0,1,2,-1,-4})));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve2(new int[]{-1,0,1,2,-1,-4})));
        assertEquals(new HashSet<>(output), new HashSet<>(p1.threeSum(new int[]{-1,0,1,2,-1,-4})));
        assertEquals(new HashSet<>(output), new HashSet<>(p2.threeSum(new int[]{-1,0,1,2,-1,-4})));
    }
    @Test
    public void test2() {
        List<List<Integer>> output = new ArrayList<>();
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve1(new int[]{0})));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve2(new int[]{0})));
        assertEquals(new HashSet<>(output), new HashSet<>(p1.threeSum(new int[]{0})));
        assertEquals(new HashSet<>(output), new HashSet<>(p2.threeSum(new int[]{0})));
    }
    @Test
    public void test3() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(0,0,0));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve1(new int[]{0,0,0,0})));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve2(new int[]{0,0,0,0})));
        assertEquals(new HashSet<>(output), new HashSet<>(p1.threeSum(new int[]{0,0,0,0})));
        assertEquals(new HashSet<>(output), new HashSet<>(p2.threeSum(new int[]{0,0,0,0})));
    }
    @Test
    public void test4() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-2,0,2));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve1(new int[]{-2,0,0,2,2})));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve2(new int[]{-2,0,0,2,2})));
        assertEquals(new HashSet<>(output), new HashSet<>(p1.threeSum(new int[]{-2,0,0,2,2})));
        assertEquals(new HashSet<>(output), new HashSet<>(p2.threeSum(new int[]{-2,0,0,2,2})));
    }
    @Test
    public void test5() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-2,0,2));
        output.add(Arrays.asList(-2,1,1));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve1(new int[]{-2,0,1,1,2})));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve2(new int[]{-2,0,1,1,2})));
        assertEquals(new HashSet<>(output), new HashSet<>(p1.threeSum(new int[]{-2,0,1,1,2})));
        assertEquals(new HashSet<>(output), new HashSet<>(p2.threeSum(new int[]{-2,0,1,1,2})));
    }
}
