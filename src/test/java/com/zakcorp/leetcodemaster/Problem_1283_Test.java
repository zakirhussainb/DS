package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1283_Test {
    Problem_1283.Solver p = new Problem_1283.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1(new int[]{1, 2, 5, 9}, 6));
        assertEquals(5, p.solve2(new int[]{1, 2, 5, 9}, 6));
    }
    @Test
    public void test2() {
        assertEquals(495280, p.solve1(new int[]{962551,933661,905225,923035,990560}, 10));
        assertEquals(495280, p.solve2(new int[]{962551,933661,905225,923035,990560}, 10));
    }
}
