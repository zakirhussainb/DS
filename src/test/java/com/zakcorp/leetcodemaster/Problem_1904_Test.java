package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1904_Test
{
    Problem_1904.Solver p = new Problem_1904.Solver();
    @Test
    public void test1() {
        assertEquals(22, p.solve1("21:30", "03:00"));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1("09:31", "10:14"));
    }
    @Test
    public void test3() {
        assertEquals( 0, p.solve1( "00:47", "00:57" ) );
    }
}
