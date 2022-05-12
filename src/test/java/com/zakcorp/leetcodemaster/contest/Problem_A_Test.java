package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( "777", p.solve1("6777133339"));
    }
    @Test
    public void test2() {
        assertEquals( "000", p.solve1("2300019"));
    }
    @Test
    public void test3() {
        assertEquals( "", p.solve1("42352338"));
    }
    @Test
    public void test4() {
        assertEquals( "999", p.solve1("1134324999"));
    }
}
