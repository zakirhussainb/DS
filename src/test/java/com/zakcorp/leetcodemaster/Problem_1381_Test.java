package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1381_Test {
    Problem_1381.CustomStack p;
    @Test
    public void test1() {
        p = new Problem_1381.CustomStack(3);
        p.push(1);
        p.push(2);
        System.out.println(p.pop());
        p.push(2);
        p.push(3);
        p.push(4);
        p.increment(5, 100);
        p.increment(2, 100);
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
    }
}
