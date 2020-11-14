package com.zakcorp.leetcodemaster.contest.weekly;

import com.zakcorp.leetcodemaster.contest.weekly.Problem_5380;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_5380_Test {
    Problem_5380.Solver p = new Problem_5380.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new String[]{"as","hero"},
                p.stringMatchingUsingSet(new String[]{"mass","as","hero","superhero"}).toArray());
        assertArrayEquals(new String[]{"as","hero"},
                p.stringMatching(new String[]{"mass","as","hero","superhero"}).toArray());
    }
    @Test
    public void test2() {
        assertArrayEquals(new String[]{"et","code"},
                p.stringMatchingUsingSet(new String[]{"leetcode","et","code"}).toArray());
        assertArrayEquals(new String[]{"et","code"},
                p.stringMatching(new String[]{"leetcode","et","code"}).toArray());
    }
    @Test
    public void test3() {
        assertArrayEquals(new String[]{"bl"},
                p.stringMatchingUsingSet(new String[]{"blue","green","bl"}).toArray());
        assertArrayEquals(new String[]{"bl"},
                p.stringMatching(new String[]{"blue","green","bl"}).toArray());
    }
    @Test
    public void test4() {
        assertArrayEquals(new String[]{"leetcode","od","am"},
                p.stringMatchingUsingSet(new String[]{"leetcoder","leetcode","od","hamlet","am"}).toArray());
        assertArrayEquals(new String[]{"leetcode","od","am"},
                p.stringMatching(new String[]{"leetcoder","leetcode","od","hamlet","am"}).toArray());
    }

}
