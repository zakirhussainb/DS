package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_448_Test {
    Problem_448.Solver p = new Problem_448.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(5, 6), p.solve1(new int[]{4,3,2,7,8,2,3,1}));
        assertEquals(Arrays.asList(5, 6), p.solve2(new int[]{4,3,2,7,8,2,3,1}));
        assertEquals(Arrays.asList(5, 6), p.solve3(new int[]{4,3,2,7,8,2,3,1}));
    }
    @Test
    public void test2() {
        assertEquals(Collections.singletonList(2), p.solve1(new int[]{1,1}));
        assertEquals(Collections.singletonList(2), p.solve2(new int[]{1,1}));
        assertEquals(Collections.singletonList(2), p.solve3(new int[]{1,1}));
    }
}
