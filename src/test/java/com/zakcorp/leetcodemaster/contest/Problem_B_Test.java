package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{3,6,1,2,5}, 2));
        assertEquals(2, p.solve2(new int[]{3,6,1,2,5}, 2));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{1,2,3}, 1));
        assertEquals(2, p.solve2(new int[]{1,2,3}, 1));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1(new int[]{2,2,4,5}, 0));
        assertEquals(3, p.solve2(new int[]{2,2,4,5}, 0));
    }
}
