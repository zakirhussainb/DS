package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_387_Test {
    Problem_387.Solver p = new Problem_387.Solver();
    @Test
    public void test1() {
        assertEquals(0, p.firstUniqChar("leetcode"));
    }
    @Test
    public void test2() {
        assertEquals(2, p.firstUniqChar("loveleetcode"));
    }
    @Test
    public void test3() {
        assertEquals(8, p.firstUniqChar("dddccdbba"));
    }
    @Test
    public void test4() {
        assertEquals(8, p.firstUniqChar("z"));
    }

}
