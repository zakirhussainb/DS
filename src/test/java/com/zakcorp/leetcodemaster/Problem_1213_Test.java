package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_1213_Test {
    Problem_1213.Solver p = new Problem_1213.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 5), p.solve1(new int[]{1,2,3,4,5},new int[]{1,2,5,7,9},new int[]{1,3,4,5,8}));
        assertEquals(Arrays.asList(1, 5), p.solve2(new int[]{1,2,3,4,5},new int[]{1,2,5,7,9},new int[]{1,3,4,5,8}));
    }
}
