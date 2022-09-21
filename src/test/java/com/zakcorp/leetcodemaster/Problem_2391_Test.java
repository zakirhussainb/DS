package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2391_Test {
    Problem_2391.Solver p = new Problem_2391.Solver();
    @Test
    public void test1() {
        assertEquals(21, p.solve1(new String[]{"G","P","GP","GG"}, new int[]{2,4,3}));
    }
    @Test
    public void test2() {
        assertEquals(37, p.solve1(new String[]{"MMM","PGM","GP"}, new int[]{3,10}));
    }
}
