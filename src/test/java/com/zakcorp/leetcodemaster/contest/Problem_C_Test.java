package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_C_Test {
    Problem_C.NumberContainers2 nc = new Problem_C.NumberContainers2();
    @Test
    public void test1() {
        assertEquals(-1, nc.find(10));
        nc.change(2, 10);
        nc.change(1, 10);
        nc.change(3, 10);
        nc.change(5, 10);
        assertEquals(1, nc.find(10));
        nc.change(1, 20);
        assertEquals(2, nc.find(10));
    }
//    ["NumberContainers","change","find","change","find","find","find"]
//            [[],[1,10],[10],[1,20],[10],[20],[30]]
    @Test
    public void test2() {
        nc.change(1, 10);
        assertEquals(1, nc.find(10));
        nc.change(1, 20);
        assertEquals(-1, nc.find(10));
        assertEquals(1, nc.find(20));
        assertEquals(-1, nc.find(30));
    }
}
