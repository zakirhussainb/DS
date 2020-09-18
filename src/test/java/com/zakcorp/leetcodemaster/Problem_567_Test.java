package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_567_Test {
    Problem_567 p = new Problem_567();
    @Test
    public void test1() {
        assertTrue(p.checkInclusion("ab", "eidbaooo"));
    }
    @Test
    public void test2() {
        assertFalse(p.checkInclusion("ab", "eidboaoo"));
    }
}
