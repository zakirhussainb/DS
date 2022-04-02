package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( 3, p.solve1(10, 7));
    }
    @Test
    public void test2() {
        assertEquals( 3, p.solve1(10, 82));
    }
    @Test
    public void test3() {
        assertEquals( 3, p.solve1(3, 4));
    }
}
