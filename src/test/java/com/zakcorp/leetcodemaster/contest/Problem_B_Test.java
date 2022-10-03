package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    @Test
    public void test1() {
        Problem_B.Solver p = new Problem_B.Solver(4);

        p.upload(3);
        System.out.println(p.longest());
        p.upload(1);
        System.out.println(p.longest());
        p.upload(2);
        System.out.println(p.longest());
    }
    @Test
    public void test2() {
        Problem_B.Solver p = new Problem_B.Solver(5);

        System.out.println(p.longest());
        p.upload(1);
        System.out.println(p.longest());
        p.upload(5);
        System.out.println(p.longest());
    }
}
