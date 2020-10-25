package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1629_Test {
    Problem_1629.Solver  p = new Problem_1629.Solver();
    @Test
    public void test1() {
        assertEquals('c', p.solve1(new int[]{9,29,49,50}, "cbcd"));
    }
    @Test
    public void test2() {
        assertEquals('a', p.solve1(new int[]{12,23,36,46,62}, "spuda"));
    }
    @Test
    public void test3() {
        assertEquals('q', p.solve1(new int[]{23,34,43,59,62,80,83,92,97}, "qgkzzihfc"));
    }
}
