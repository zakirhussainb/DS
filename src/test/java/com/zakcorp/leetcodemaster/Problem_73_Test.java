package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_73_Test {
    Problem_73.Solver p = new Problem_73.Solver();
    @Test
    public void test1() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        assertArrayEquals(matrix, p.solve1(matrix));
    }
}
