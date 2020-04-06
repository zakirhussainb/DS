package com.zakcorp.leetcodemaster;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_589_Test {
    Problem_589.Solver p = new Problem_589.Solver();
    Problem_589.Node one;
    @Before
    public void setup() {
        one = new Problem_589.Node(1);
        Problem_589.Node three = new Problem_589.Node(3);
        List<Problem_589.Node> threeChildren = new ArrayList<>();
        threeChildren.add(new Problem_589.Node(5));
        threeChildren.add(new Problem_589.Node(6));
        three.children = threeChildren;
        List<Problem_589.Node> oneChildren = new ArrayList<>();
        oneChildren.add(three);
        oneChildren.add(new Problem_589.Node(2));
        oneChildren.add(new Problem_589.Node(4));
        one.children = oneChildren;
    }
    @Test
    public void test1_recursive() {
        List<Integer> list = new ArrayList<>();
        assertEquals(Arrays.asList(1,3,5,6,2,4), p.recursive(one, list));
    }
    @Test
    public void test1_iterative() {
        List<Integer> list = new ArrayList<>();
        assertEquals(Arrays.asList(1,3,5,6,2,4), p.iterative(one, list));
    }
}
