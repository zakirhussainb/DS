package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( 2, p.solve2(240, 2));
    }
    @Test
    public void test2() {
        assertEquals( 2, p.solve2(430043, 2));
    }
    @Test
    public void test3() {
        assertEquals( 2, p.solve2(11, 1));
    }
    @Test
    public void test4() {
        assertEquals( 1, p.solve2(2, 1));
    }
}
