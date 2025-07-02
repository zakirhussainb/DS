package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1922_Test {
    Problem_1922.Solver p = new Problem_1922.Solver();
    Problem_1922.Solver1 p1 = new Problem_1922.Solver1();
    @Test
    public void test1() {
//        assertEquals(5, p.solve1(1));
        assertEquals(5, p1.solve1(1));
    }
    @Test
    public void test2() {
//        assertEquals(400, p.solve1(4));
        assertEquals(400, p1.solve1(4));
    }
    @Test
    public void test3() {
//        assertEquals(564908303, p.solve1(50));
        assertEquals(564908303, p1.solve1(50));
    }
}
