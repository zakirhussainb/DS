package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1446_Test {
    Problem_1446.Solver p = new Problem_1446.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1("leeetcode"));
        assertEquals(3, p.solve2("leeetcode"));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1("abbcccddddeeeeedcba"));
        assertEquals(5, p.solve2("abbcccddddeeeeedcba"));
    }
    @Test
    public void test3() {
        assertEquals(5, p.solve1("triplepillooooow"));
        assertEquals(5, p.solve2("triplepillooooow"));
    }
    @Test
    public void test4() {
        assertEquals(11, p.solve1("hooraaaaaaaaaaay"));
        assertEquals(11, p.solve2("hooraaaaaaaaaaay"));
    }
    @Test
    public void test5() {
        assertEquals(1, p.solve1("tourist"));
        assertEquals(1, p.solve2("tourist"));
    }
    @Test
    public void test6() {
        assertEquals(1, p.solve1("a"));
        assertEquals(1, p.solve2("a"));
    }
    @Test
    public void test7() {
        assertEquals(2, p.solve1("ccbccbb"));
        assertEquals(2, p.solve2("ccbccbb"));
    }
    @Test
    public void test8() {
        assertEquals(2, p.solve1("cc"));
        assertEquals(2, p.solve2("cc"));
    }
}
