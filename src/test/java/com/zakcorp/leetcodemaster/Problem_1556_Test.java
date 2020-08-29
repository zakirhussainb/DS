package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1556_Test {
    Problem_1556 p = new Problem_1556();
    @Test
    public void test1() {
        assertEquals("123.456.789", p.thousandSeparator(123456789));
    }
    @Test
    public void test2() {
        assertEquals("2.147.483.647", p.thousandSeparator(2147483647));
    }
    @Test
    public void test3() {
        assertEquals("51.040", p.thousandSeparator(51040));
    }
}
