package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_658_Test {
    Problem_658.Solver p = new Problem_658.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1,2,3,4), p.solve1(new int[]{1,2,3,4,5}, 4, 3));
        assertEquals(Arrays.asList(1,2,3,4), p.solve2(new int[]{1,2,3,4,5}, 4, 3));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(1,2,3,4), p.solve1(new int[]{1,2,3,4,5}, 4, -1));
        assertEquals(Arrays.asList(1,2,3,4), p.solve2(new int[]{1,2,3,4,5}, 4, -1));
    }
    @Test
    public void test3() {
        assertEquals(Arrays.asList(1,2,3,4), p.solve1(new int[]{1,2,3,4,5}, 4, 1));
        assertEquals(Arrays.asList(1,2,3,4), p.solve2(new int[]{1,2,3,4,5}, 4, 1));
    }
    @Test
    public void test4() {
        assertEquals(Arrays.asList(2,3,4,5), p.solve1(new int[]{1,2,3,4,5}, 4, 5));
        assertEquals(Arrays.asList(2,3,4,5), p.solve2(new int[]{1,2,3,4,5}, 4, 5));
    }
    @Test
    public void test5() {
        assertEquals(Arrays.asList(2,3,4,5), p.solve1(new int[]{1,2,3,4,5}, 4, 6));
        assertEquals(Arrays.asList(2,3,4,5), p.solve2(new int[]{1,2,3,4,5}, 4, 6));
    }
    @Test
    public void test6() {
//        assertEquals(Arrays.asList(0,1,1,1,2,3,6,7,8), p.solve1(new int[]{0,1,1,1,2,3,6,7,8,9}, 9, 4));
        assertEquals(Arrays.asList(0,1,1,1,2,3,6,7,8), p.solve2(new int[]{0,1,1,1,2,3,6,7,8,9}, 9, 4));
    }
}
