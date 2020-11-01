package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1518_Test {
    Problem_1518.Solver p = new Problem_1518.Solver();
    @Test
    public void test1() {
        assertEquals(13, p.solve1(9, 3));
    }
    @Test
    public void test2() {
        assertEquals(19, p.solve1(15, 4));
    }
    @Test
    public void tes3() {
        assertEquals(6, p.solve1(5, 5));
    }
    @Test
    public void test4() {
        assertEquals(2, p.solve1(2, 3));
    }

}
