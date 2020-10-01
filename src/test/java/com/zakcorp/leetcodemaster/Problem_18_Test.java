package com.zakcorp.leetcodemaster;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_18_Test {
    Problem_18.Solver p = new Problem_18.Solver();
    @Test
    public void test1() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-1, 0, 0, 1));
        output.add(Arrays.asList(-2, -1, 1, 2));
        output.add(Arrays.asList(-2, 0, 0, 2));
        assertEquals(new HashSet<>(output), new HashSet<>(p.solve1(new int[]{1,0,-1,0,-2,2}, 0)));
    }
}
