package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2947_Test {
    Problem_2947.Solver p = new Problem_2947.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1("baeyh", 2));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1("abba", 1));
    }
}
