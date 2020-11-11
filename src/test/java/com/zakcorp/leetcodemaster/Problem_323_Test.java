package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_323_Test {
    Problem_323.Solver1 p1 = new Problem_323.Solver1();
    Problem_323.Solver2 p2 = new Problem_323.Solver2();
    @Test
    public void test1() {
        assertEquals(2, p1.solve1(5, new int[][]{ {0, 1}, {1, 2}, {3, 4} }));
        assertEquals(2, p2.solve1(5, new int[][]{ {0, 1}, {1, 2}, {3, 4} }));
    }
}
