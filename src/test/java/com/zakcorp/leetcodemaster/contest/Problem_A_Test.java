package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals("this is a secret",
                p.solve1("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv") );
    }
    @Test
    public void test2() {
        assertEquals("the five boxing wizards jump quickly",
                p.solve1("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb") );
    }
    @Test
    public void test3() {
        assertEquals("the five boxing wizards jump quickly",
                p.solve1("eljuxhpwnyrdgtqkviszcfmaboeljuxhpwnyrdgtqkviszcfmaboeljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb") );
    }
}
