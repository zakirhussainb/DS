package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals("there are $0.50 $1.00 and 5$ candies in the shop",
                p.solve1("there are $1 $2 and 5$ candies in the shop", 50));
    }
    @Test
    public void test2() {
        assertEquals("1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$",
                p.solve1("1 2 $3 4 $5 $6 7 8$ $9 $10$", 100));
    }
    @Test
    public void test3() {
        assertEquals("ka3caz4837h6ada4 r1 $547.82",
                p.solve1("ka3caz4837h6ada4 r1 $602", 9));
    }
    @Test
    public void test4() {
        assertEquals("$2658129.12 5q $2113353.36",
                p.solve1("$7383692 5q $5870426", 64));
    }
    @Test
    public void test5() {
        assertEquals("706hzu76jjh7yufr5x9ot60v149k5 $5509377493.92 pw2o $4.32",
                p.solve1("706hzu76jjh7yufr5x9ot60v149k5 $7651913186 pw2o $6", 28));
    }
    @Test
    public void test6() {
        assertEquals("$2$3 $10.00 $100.00 $1.00 200 $33.00 33$ $$ $99.00 $99999.00 $9999999999.00",
                p.solve1("$2$3 $10 $100 $1 200 $33 33$ $$ $99 $99999 $9999999999", 0));
    }
}
