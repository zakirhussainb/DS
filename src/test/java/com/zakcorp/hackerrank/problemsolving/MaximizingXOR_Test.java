package com.zakcorp.hackerrank.problemsolving;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximizingXOR_Test {
    MaximizingXOR p = new MaximizingXOR();
    @Test
    public void test1() {
        assertEquals(7, p.maximizingXor(11, 12));
    }
    @Test
    public void test2() {
        assertEquals(7, p.maximizingXor(10, 15));
    }
}
