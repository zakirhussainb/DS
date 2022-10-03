package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1578_Test {
    Problem_1578.Solver p = new Problem_1578.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("abaac", new int[]{1,2,3,4,5}));
    }
    @Test
    public void test2() {
        assertEquals(15, p.solve1("aaaaaa", new int[]{4,5,2,3,1,6}));
    }
}
