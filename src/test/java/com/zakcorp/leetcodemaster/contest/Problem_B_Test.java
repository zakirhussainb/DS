package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals( 8, p.solve1(new int[]{1,2,3,4,5}));
    }
    @Test
    public void test2() {
        assertEquals( 5, p.solve1(new int[]{5}));
    }
    @Test
    public void test3() {
        assertEquals( 3, p.solve1(new int[]{5,8}));
    }
}
