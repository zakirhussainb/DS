package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_D_Test {
    Problem_D.Solver p = new Problem_D.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.solve1(new int[]{2,1,4,3,5}, 10));
        assertEquals(6, p.solve2(new int[]{2,1,4,3,5}, 10));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1(new int[]{1,1,1}, 5));
    }
}
