package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_70_Test {
    Problem_70.Solver p = new Problem_70.Solver();
    Problem_70.Solver1 p1 = new Problem_70.Solver1();
    Problem_70.Solver2 p2 = new Problem_70.Solver2();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(2));
        assertEquals(2, p1.solve1(2));
        assertEquals(2, p2.solve1(2));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1(3));
        assertEquals(3, p1.solve1(3));
        assertEquals(3, p2.solve1(3));
    }
    @Test
    public void test4() {
//        assertEquals(3, p.solve1(45));
        assertEquals(1836311903, p1.solve1(45));
        assertEquals(1836311903, p2.solve1(45));
    }
}
