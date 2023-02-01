package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_881_Test
{
    Problem_881.Solver p = new Problem_881.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{3, 2, 2, 1, 1}, 3));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[]{1, 2}, 3));
    }
    @Test
    public void test3() {
        assertEquals(4, p.solve1(new int[]{3,5,3,4}, 5));
    }
}
