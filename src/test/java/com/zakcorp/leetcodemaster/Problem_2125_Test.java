package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2125_Test {
    Problem_2125.Solver p = new Problem_2125.Solver();
    Problem_2125.Solver1 p1 = new Problem_2125.Solver1();
    @Test
    public void test1() {
        assertEquals(8, p.solve1(new String[]{"011001","000000","010100","001000"}));
        assertEquals(8, p1.solve1(new String[]{"011001","000000","010100","001000"}));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new String[]{"000","111","000"}));
        assertEquals(0, p1.solve1(new String[]{"000","111","000"}));
    }
}
