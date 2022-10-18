package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2342_Test {
    Problem_2342.Solver p = new Problem_2342.Solver();
    Problem_2342.Solver1 p1 = new Problem_2342.Solver1();
    @Test
    public void test1() {
        assertEquals(54, p.solve1(new int[]{18,43,36,13,7}));
        assertEquals(54, p1.solve1(new int[]{18,43,36,13,7}));
    }
    @Test
    public void test2() {
        assertEquals(-1, p.solve1(new int[]{10,12,19,14}));
        assertEquals(-1, p1.solve1(new int[]{10,12,19,14}));
    }
}
