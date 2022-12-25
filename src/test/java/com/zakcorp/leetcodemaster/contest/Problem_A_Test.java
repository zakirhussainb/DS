package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( 1, p.solve1(new String[]{"hello","i","am","leetcode"}, "hello", 1));
    }
    @Test
    public void test2() {
        assertEquals( 1, p.solve1(new String[]{"a","b","leetcode"}, "leetcode", 0));
    }
}
