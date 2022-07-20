package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_224_Test {
    Problem_224.Solver p = new Problem_224.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1("1 + 1"));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(" 2-1 + 2 "));
    }
    @Test
    public void test3() {
        assertEquals(23, p.solve1("(1+(4+5+2)-3)+(6+8)"));
    }
    @Test
    public void test4() {
        assertEquals(22, p.solve1("((10 * (6 / ((9 + 3) * -11))) + 17) + 5"));
    }
}
