package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,2,6}, p.baseUnitConversions(new int[][]{{0,1,2},{1,2,3}}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,2,3,8,10,6,30,24}, p.baseUnitConversions(new int[][]{{0,1,2},{0,2,3},{1,3,4},{1,4,5},{2,5,2},{4,6,3},{5,7,4}}));
    }
}
