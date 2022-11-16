package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1679_Test
{
    Problem_1679.Solver p = new Problem_1679.Solver();

    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{1,2,3,4}, 5));
    }

    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[]{3,1,3,4,3}, 6));
    }

    @Test
    public void test3() {
        assertEquals(4, p.solve1(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3));
    }
}
