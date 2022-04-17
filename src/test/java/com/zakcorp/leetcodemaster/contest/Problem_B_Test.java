package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals( 4, p.solve1(new int[]{2,2,3,3,2,4,4,4,4,4}));
    }
    @Test
    public void test2() {
        assertEquals( -1, p.solve1(new int[]{2,3,3}));
    }
    @Test
    public void test3() {
        assertEquals( 2, p.solve1(new int[]{5,5,5,5}));
    }
    @Test
    public void test4() {
        assertEquals( -1, p.solve1(new int[]{9,9,11,9,22,22,11,552,22,22,55}));
    }
}
