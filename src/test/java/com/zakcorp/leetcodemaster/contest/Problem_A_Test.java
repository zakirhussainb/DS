package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(9, p.solve1( new int[] {2, 1, 5, 1, 3, 2}, 3));
    }
    @Test
    public void test2() {
        assertEquals(39, p.solve1( new int[] {1, 4, 2, 10, 23, 3, 1, 0, 20}, 4));
    }

    @Test
    public void test3() {
        assertEquals(-1, p.solve1( new int[] {2, 3}, 3));
    }
}
