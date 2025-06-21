package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2918_Test {
    Problem_2918.Solver p = new Problem_2918.Solver();
    @Test
    public void test1() { // Case 1: Both have at least 1 zero
        assertEquals(12, p.solve1(new int[]{3,2,0,1,0}, new int[]{6,5,0}));
    }

    @Test
    public void test2() { // Case 2: Array_1 has zeros, but Array_2 does not.
        assertEquals(-1, p.solve1(new int[]{2,0,2,0}, new int[]{1,4}));
    }

    @Test
    public void test3() { // Case 3: Array_1 does not have zeros, but Array_2 has.
        assertEquals(8, p.solve1(new int[]{2,2,2,2}, new int[]{1,4,0}));
    }

    @Test
    public void test4() { // Case 4: Array_1 does not have zeros, and Array_2 does not have zeros.
        assertEquals(-1, p.solve1(new int[]{2,2,2,2}, new int[]{1,4}));
    }
}
