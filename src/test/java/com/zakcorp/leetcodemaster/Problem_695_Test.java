package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_695_Test {
    Problem_695.DFSRecursive p = new Problem_695.DFSRecursive();
    Problem_695.DFSRecursive1 p1 = new Problem_695.DFSRecursive1();
    Problem_695.DFSIterative p2 = new Problem_695.DFSIterative();

    @Test
    public void test1() {
        assertEquals(6, p.solve1(new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        }));
        assertEquals(6, p1.maxAreaOfIsland(new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        }));
        assertEquals(6, p2.maxAreaOfIsland(new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        }));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[][]{
                {0,0,0,0,0,0,0,0}
        }));
        assertEquals(0, p1.maxAreaOfIsland(new int[][]{
                {0,0,0,0,0,0,0,0}
        }));
    }
    @Test
    public void test3() {
        assertEquals(0, p2.maxAreaOfIsland(new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 1, 1},
                {1, 1, 1}
        }));
    }
}
