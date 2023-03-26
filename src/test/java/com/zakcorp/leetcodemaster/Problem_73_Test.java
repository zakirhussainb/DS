package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * [[1,1,1],[1,0,1],[1,1,1]]
 * [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * [[-2147483648],[2],[3]]
 * [[9,3,5,7,2],[7,2,9,2147483647,4],[-2147483648,7,3,6,9],[7,1,3,2,0]]
 */
public class Problem_73_Test {
    Problem_73.Solver p = new Problem_73.Solver();
    Problem_73.Solver1 p1 = new Problem_73.Solver1();
    @Test
    public void test1() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//        assertArrayEquals(matrix, p.solve1(matrix));
        assertArrayEquals(matrix, p1.solve1(matrix));
    }
}
