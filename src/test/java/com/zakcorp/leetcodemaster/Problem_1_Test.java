package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1_Test {
    Problem_1.Solver p = new Problem_1.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1}, p.solve1(new int[]{2, 7, 11, 15}, 9));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{0, 1}, p.solve1(new int[]{2, 7, 11, 15}, 9));
    }
}
