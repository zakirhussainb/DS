package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_344_Test {
    Problem_344.Solver p = new Problem_344.Solver();

    @Test
    public void test1() {
        assertArrayEquals(new char[]{'o','l','l','e','h'}, p.reverseString(new char[]{'h','e','l','l','o'}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new char[]{'h','a','n','n','a','H'}, p.reverseString(new char[]{'H','a','n','n','a','h'}));
    }

}
