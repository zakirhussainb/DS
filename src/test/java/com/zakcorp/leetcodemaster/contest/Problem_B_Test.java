package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    Problem_B.Solver1 p1 = new Problem_B.Solver1();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(1));
        assertEquals(4, p1.solve1(1));
    }
    @Test
    public void test2() {
        assertEquals(9, p.solve1(2));
        assertEquals(9, p1.solve1(2));
    }
    @Test
    public void test3() {
//        assertEquals(500478595, p.solve1(1000));
        assertEquals(500478595, p1.solve1(1000));
    }
}
