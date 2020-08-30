package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1267_Test {
    Problem_1267 p = new Problem_1267();
    @Test
    public void test1() {
        assertEquals(0, p.countServers(new int[][]{ {1,0}, {0,1} }));
    }
    @Test
    public void test2() {
        assertEquals(3, p.countServers(new int[][]{ {1,0}, {1,1} }));
    }
    @Test
    public void test3() {
        assertEquals(4, p.countServers(new int[][]{ {1,1,0,0}, {0,0,1,0}, {0,0,1,0}, {0,0,0,1} }));
    }
    @Test
    public void test4() {
        assertEquals(5, p.countServers(new int[][]{ {1,0,0,1}, {0,0,1,0}, {1,1,0,1} }));
    }
}
