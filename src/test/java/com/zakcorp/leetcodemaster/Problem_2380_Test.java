package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2380_Test
{
    Problem_2380.Solver p = new Problem_2380.Solver();
    Problem_2380.Solver1 p1 = new Problem_2380.Solver1();
    @Test
    public void test1() {
        assertEquals(4, p.solve1("0110101"));
        assertEquals(4, p1.solve1("0110101"));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1("11100"));
        assertEquals(0, p1.solve1("11100"));
    }
}
