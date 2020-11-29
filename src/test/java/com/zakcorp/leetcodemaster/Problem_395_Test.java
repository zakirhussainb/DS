package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_395_Test {
    Problem_395.Solver p = new Problem_395.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("aaabb", 3));
//        assertEquals(3, p.generateAllSubstrings("aaabb", 3));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1("ababbc", 2));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1("ababacb", 3));
    }
    @Test
    public void test4() {
        assertEquals(6, p.solve1("zababz", 2));
    }
    @Test
    public void test5() {
        assertEquals(5, p.solve1("aaaaa", 3));
    }
}
