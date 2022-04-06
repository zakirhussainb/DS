package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1249_Test {
    Problem_1249.Solver p = new Problem_1249.Solver();
    @Test
    public void test1() {
        assertEquals("lee(t(c)o)de", p.solve1("lee(t(c)o)de)"));
    }
    @Test
    public void test2() {
        assertEquals("lee(t(c)o)de", p.solve1("lee(t(c)o)d)e"));
    }
    @Test
    public void test3() {
        assertEquals("lee(t(c)o)de", p.solve1("lee(t(c)o)d)e))"));
    }
    @Test
    public void test4() {
        assertEquals("leet", p.solve1("l(e(e(t("));
    }
    @Test
    public void test5() {
        assertEquals("", p.solve1("))(("));
    }
}
