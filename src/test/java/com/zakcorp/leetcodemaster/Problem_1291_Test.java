package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Problem_1291_Test
{
    Problem_1291.Solver p = new Problem_1291.Solver();
    @Test
    public void test1() {
        assertEquals( Arrays.asList(123, 234), p.solve1(100, 300));
    }
    @Test
    public void test2() {
        assertEquals( Arrays.asList(2345), p.solve1(1567, 2567));
    }
    @Test
    public void test3() {
        assertEquals( Arrays.asList(1234,2345,3456,4567,5678,6789,12345), p.solve1(1000, 13000));
    }
}
