package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1881_Test {
    Problem_1881.Solver p = new Problem_1881.Solver();
    @Test
    public void test1() {
        assertEquals( "87652", p.solve1("8765", 2)); // passed
        assertEquals( "87655", p.solve1("8765", 5)); // passed
        assertEquals( "87665", p.solve1("8765", 6));
        assertEquals( "999", p.solve1("99", 9));
    }
    @Test
    public void test2() {
        assertEquals( "-123", p.solve1("-13", 2));
        assertEquals( "-199", p.solve1("-19", 9));
        assertEquals( "-3587", p.solve1("-587", 3));
        assertEquals( "-5878", p.solve1("-587", 8));
    }
}
