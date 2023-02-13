package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(596, p.solve1( new int[] {7,52,2,4}));
    }
    @Test
    public void test2() {
        assertEquals(673, p.solve1( new int[] {5,14,13,8,12}));
    }
    @Test
    public void test3() {
        assertEquals(5, p.solve1( new int[] {5}));
    }
}
