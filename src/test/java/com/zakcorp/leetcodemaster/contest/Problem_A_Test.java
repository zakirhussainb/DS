package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( 1, p.solve1("1"));
        assertEquals( 1, p.solve1("5"));
        assertEquals( 2, p.solve1("10"));
        assertEquals( 11, p.solve1("20"));
        assertEquals( 506, p.solve1("1234"));
        assertEquals( 2, p.solve1("10"));
    }
}
