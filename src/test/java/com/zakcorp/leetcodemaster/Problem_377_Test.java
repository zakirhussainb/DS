package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_377_Test {
    Problem_377.Solver1 p = new Problem_377.Solver1();
    Problem_377.Solver2 p2 = new Problem_377.Solver2();
    @Test
    public void test1() {
        assertEquals(7, p.solve1(new int[]{1, 2, 3}, 4));
        assertEquals(7, p2.solve1(new int[]{1, 2, 3}, 4));
    }
    @Test
    public void test2() {
//        assertEquals(7, p.solve1(new int[]{1, 2, 3}, 4));
        assertEquals(545813094, p2.solve1(new int[]{5, 2}, 100));
    }
}
