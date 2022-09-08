package com.zakcorp.leetcodemaster;

import org.junit.Test;

public class Problem_1845_Test
{
    Problem_1845.SeatManager p;
    @Test
    public void test1() {
        p = new Problem_1845.SeatManager(5);
        System.out.println(p.reserve());
        System.out.println(p.reserve());
        p.unreserve(2);
        System.out.println(p.reserve());
        System.out.println(p.reserve());
        System.out.println(p.reserve());
        System.out.println(p.reserve());
        p.unreserve(5);
    }
}
