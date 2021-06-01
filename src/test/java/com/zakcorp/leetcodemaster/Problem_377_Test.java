package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_377_Test {
    Problem_377.Solver1 p = new Problem_377.Solver1();
    @Test
    public void test1() {
        assertEquals(7, p.solve1(new int[]{1, 2, 3}, 4));
    }
}
