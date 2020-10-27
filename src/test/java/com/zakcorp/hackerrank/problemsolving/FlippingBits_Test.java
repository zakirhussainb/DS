package com.zakcorp.hackerrank.problemsolving;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlippingBits_Test {
    FlippingBits p = new FlippingBits();
    @Test
    public void test1() {
        assertEquals(4294967286L, p.flippingBits(9));
    }
    @Test
    public void test2() {
        assertEquals(4294967291L, p.flippingBits(4));
    }
    @Test
    public void test3() {
        assertEquals(4294967290L, p.flippingBits(5));
    }
}
