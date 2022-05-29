package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_371_Test {
    Problem_371.Solver p = new Problem_371.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(1, 2));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1(2, 3));
    }
}
