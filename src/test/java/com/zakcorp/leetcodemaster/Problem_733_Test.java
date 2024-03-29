package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_733_Test {
    Problem_733.DFSRecursive p = new Problem_733.DFSRecursive();
    Problem_733.DFSIterative p1 = new Problem_733.DFSIterative();
    Problem_733.BFS p2 = new Problem_733.BFS();

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{ {2, 2, 2}, {2, 2, 0}, {2, 0, 1} },
                p.floodFill(new int[][]{ {1, 1, 1}, {1, 1, 0}, {1, 0, 1} }, 1, 1, 2));

        assertArrayEquals(new int[][]{ {2, 2, 2}, {2, 2, 0}, {2, 0, 1} },
                p1.floodFill(new int[][]{ {1, 1, 1}, {1, 1, 0}, {1, 0, 1} }, 1, 1, 2));

        assertArrayEquals(new int[][]{ {2, 2, 2}, {2, 2, 0}, {2, 0, 1} },
                p2.floodFill(new int[][]{ {1, 1, 1}, {1, 1, 0}, {1, 0, 1} }, 1, 1, 2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 1}},
                p.floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1, 1, 1));

        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 1}},
                p1.floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1, 1, 1));

        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 1}},
                p2.floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1, 1, 1));
    }
}
