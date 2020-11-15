package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_200_Test {
    Problem_200.Solver p = new Problem_200.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[][]{
                {1,1,1},
                {0,1,0},
                {1,0,0},
                {1,0,1} }));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[][]{
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0} }));
    }
}
