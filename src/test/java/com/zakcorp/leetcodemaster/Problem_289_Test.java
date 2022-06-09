package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_289_Test {
    Problem_289.Solver p = new Problem_289.Solver();
    @Test
    public void test1() {
        int[][] input = new int[][]{ {0,1,0},{0,0,1},{1,1,1},{0,0,0} };
        assertArrayEquals(new int[][]{ {0,0,0},{1,0,1},{0,1,1},{0,1,0} },
                p.solve1(input));
//        int[][] res = p.solve1(input);
//        for(int i = 0; i < res.length; i++) {
//            for(int j = 0; j < res[0].length; j++) {
//                System.out.print(res[i][j] + ",");
//            }
//            System.out.println();
//        }
    }
    @Test
    public void test2() {
        int[][] input = new int[][]{{1, 1}, {1, 0}};
        assertArrayEquals(new int[][]{{1, 1}, {1, 1}},
                p.solve1(input));
    }
}
