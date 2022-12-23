package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1328_Test
{
    Problem_1328.Solver p = new Problem_1328.Solver();
    Problem_1328.Solver1 p1 = new Problem_1328.Solver1();
    @Test
    public void test1() {
        assertEquals("aaccba", p.solve1("abccba"));
        assertEquals("aaccba", p1.solve1("abccba"));
    }
    @Test
    public void test2() {
        assertEquals("", p.solve1("a"));
        assertEquals("", p1.solve1("a"));
    }
    @Test
    public void test3() {
        assertEquals("aacdeffedcba", p.solve1("abcdeffedcba"));
        assertEquals("aacdeffedcba", p1.solve1("abcdeffedcba"));
    }
    @Test
    public void test4() {
        assertEquals("ab", p.solve1("aa"));
        assertEquals("ab", p1.solve1("aa"));
    }
    @Test
    public void test5() {
        assertEquals("az", p.solve1("zz"));
        assertEquals("az", p1.solve1("zz"));
    }
    @Test
    public void test6() {
        assertEquals("abb", p.solve1("aba"));
        assertEquals("abb", p1.solve1("aba"));
    }
    @Test
    public void test7() {
        assertEquals("azz", p.solve1("zzz"));
        assertEquals("azz", p1.solve1("zzz"));
    }
    @Test
    public void test8() {
        assertEquals("aabab", p.solve1("aabaa"));
        assertEquals("aabab", p1.solve1("aabaa"));
    }
}
