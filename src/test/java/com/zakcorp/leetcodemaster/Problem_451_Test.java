package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_451_Test {
    Problem_451.Solver p = new Problem_451.Solver();
    @Test
    public void test1() {
        assertEquals("eert", p.solve1("tree"));
    }
    @Test
    public void test2() {
        assertEquals("cccaaa", p.solve1("cccaaa"));
    }
    @Test
    public void test3() {
        assertEquals("bbAa", p.solve1("Aabb"));
    }
}
