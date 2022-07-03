package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_232_Test {

    @Test
    public void test1() {
        Problem_232.MyQueue p = new Problem_232.MyQueue();
        p.push(10);
        p.push(20);
        p.push(30);
        assertEquals(10, p.peek());
        assertEquals(10, p.pop());
        assertFalse(p.empty());
    }
}
