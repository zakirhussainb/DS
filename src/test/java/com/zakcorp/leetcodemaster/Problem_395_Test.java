package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_395_Test {
    Problem_395.Solver p = new Problem_395.Solver();
    Problem_395.Solver1 p1 = new Problem_395.Solver1();
    Problem_395.Solver2 p2 = new Problem_395.Solver2();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("aaabb", 3));
        assertEquals(3, p1.solve1("aaabb", 3));
        assertEquals(3, p2.solve1("aaabb", 3));
//        assertEquals(3, p.generateAllSubstrings("aaabb", 3));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1("ababbc", 2));
        assertEquals(5, p1.solve1("ababbc", 2));
        assertEquals(5, p2.solve1("ababbc", 2));
    }
    @Test
    public void test3() {
//        assertEquals(0, p.solve1("ababacb", 3));
//        assertEquals(0, p1.solve1("ababacb", 3));
        assertEquals(0, p2.solve1("ababacb", 3));
    }
    @Test
    public void test4() {
        assertEquals(6, p.solve1("zababz", 2));
        assertEquals(6, p1.solve1("zababz", 2));
        assertEquals(6, p2.solve1("zababz", 2));
    }
    @Test
    public void test5() {
        assertEquals(5, p.solve1("aaaaa", 3));
        assertEquals(5, p1.solve1("aaaaa", 3));
        assertEquals(5, p2.solve1("aaaaa", 3));
    }
}
