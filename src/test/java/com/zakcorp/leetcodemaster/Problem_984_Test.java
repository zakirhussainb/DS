package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_984_Test
{
    Problem_984.Solver p = new Problem_984.Solver();
    Problem_984.Solver1 p1 = new Problem_984.Solver1();
    @Test
    public void test1() {
        assertEquals("bab", p.solve1(1, 2));
        assertEquals("bab", p1.solve1(1, 2));
    }
    @Test
    public void test2() {
        assertEquals("aabaabaa", p.solve1(6, 2));
        assertEquals("aabaabaa", p1.solve1(6, 2));
    }
    @Test
    public void test3() {
        assertEquals("aabaa", p.solve1(4, 1));
        assertEquals("aabaa", p1.solve1(4, 1));
    }
    @Test
    public void test4() {
        assertEquals("abababab", p.solve1(4, 4));
        assertEquals("abababab", p1.solve1(4, 4));
    }

    @Test
    public void test5() {
        assertEquals("bbabbababababab", p.solve1(6, 9));
        assertEquals("bbabbababababab", p1.solve1(6, 9));
    }
}
