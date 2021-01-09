package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(10, p.solve1(4));
    }
    @Test
    public void test2() {
        assertEquals(37, p.solve1(10));
    }
    @Test
    public void test3() {
        assertEquals(96, p.solve1(20));
    }
    @Test
    public void test4() {
        assertEquals(74926, p.solve1(1000));
    }
}
