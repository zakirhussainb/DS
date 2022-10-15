package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( 2, p.solve1("?5:00"));
        assertEquals( 100, p.solve1("0?:0?"));
        assertEquals( 1440, p.solve1("??:??"));
        assertEquals( 3, p.solve1("?2:16"));
        assertEquals( 240, p.solve1("2?:??"));
    }
}
