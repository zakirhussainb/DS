package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1410_Test {
    Problem_1410.Solver p = new Problem_1410.Solver();
    @Test
    public void test1() {
        assertEquals("& is an HTML entity but &ambassador; is & not.",
                p.solve1("&amp; is an HTML entity but &ambassador; is &amp; not."));
    }
    @Test
    public void test2() {
        assertEquals("&gt;",
                p.solve1("&amp;gt;"));
    }
    @Test
    public void test3() {
        assertEquals("and I quote: \"...\"",
                p.solve1("and I quote: &quot;...&quot;"));
    }
    @Test
    public void test4() {
        assertEquals("&>",
                p.solve1("&&gt;"));
    }
    @Test
    public void test5() {
        assertEquals("&&&",
                p.solve1("&&&"));
    }
}
