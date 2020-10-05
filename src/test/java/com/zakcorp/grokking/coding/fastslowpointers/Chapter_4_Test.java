package com.zakcorp.grokking.coding.fastslowpointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class Chapter_4_Test {
    Chapter_4 p = new Chapter_4();
    @Test
    public void test1() {
        assertTrue(p.isHappy(19));
    }
    @Test
    public void test2() {
        assertFalse(p.isHappy(12));
    }
}
