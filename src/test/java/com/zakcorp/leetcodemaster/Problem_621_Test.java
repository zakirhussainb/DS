package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_621_Test {
    Problem_621.Solver p = new Problem_621.Solver();
    @Test
    public void test1() {
        assertEquals(8, p.solve1(new char[]{'A','A','A','B','B','B'}, 2));
        assertEquals(8, p.solve2(new char[]{'A','A','A','B','B','B'}, 2));
    }
}
