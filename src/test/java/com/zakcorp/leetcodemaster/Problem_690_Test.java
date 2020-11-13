package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_690_Test {
    Problem_690.Solver p = new Problem_690.Solver();
    @Test
    public void test1() {
        List<Problem_690.Employee> list = new ArrayList<>();
        list.add(new Problem_690.Employee(1, 4, Collections.singletonList(2)));
        list.add(new Problem_690.Employee(2, 3, Collections.singletonList(3)));
        list.add(new Problem_690.Employee(3, 2, new ArrayList<>()));
        assertEquals(9, p.solve1(list, 1));
    }
}
