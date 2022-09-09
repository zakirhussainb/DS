package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1433_Test
{
    Problem_1433.Solver p = new Problem_1433.Solver();
    Problem_1433.Solver1 p1 = new Problem_1433.Solver1();
    @Test
    public void test1() {
        assertTrue(p.solve1("abc", "xya"));
        assertTrue(p1.solve1("abc", "xya"));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1("abe", "acd"));
        assertFalse(p1.solve1("abe", "acd"));
    }
    @Test
    public void test3() {
        assertTrue(p.solve1("leetcodee", "interview"));
        assertTrue(p1.solve1("leetcodee", "interview"));
    }
    @Test
    public void test4() {
        assertTrue(p.solve1("szy", "cid"));
        assertTrue(p1.solve1("szy", "cid"));
    }
    @Test
    public void test5() {
        assertTrue(p.solve1("yopumzgd", "pamntyya"));
        assertTrue(p1.solve1("yopumzgd", "pamntyya"));
    }
}
