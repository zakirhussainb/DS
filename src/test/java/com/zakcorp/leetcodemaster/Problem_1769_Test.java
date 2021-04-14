package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1769_Test {
    Problem_1769.Solver p = new Problem_1769.Solver();
    @Test
    public void test1() {
        assertArrayEquals( new int[]{1, 1, 3}, p.solve1("110") );
        assertArrayEquals( new int[]{1, 1, 3}, p.solve2("110") );
    }
    @Test
    public void test2() {
        assertArrayEquals( new int[]{11, 8, 5, 4, 3, 4}, p.solve1("001011") );
        assertArrayEquals( new int[]{11, 8, 5, 4, 3, 4}, p.solve2("001011") );
    }
}
