package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals("ba", p.solve1("a#b%*"));
    }
    @Test
    public void test2() {
        assertEquals("", p.solve1("z*#"));
    }
    @Test
    public void test3() {
        assertEquals("", p.solve1("%"));
    }
    @Test
    public void test4() {
        assertEquals("z", p.solve1("z"));
    }
    @Test
    public void test5() {
        assertEquals("", p.solve1("*#%"));
    }
}
