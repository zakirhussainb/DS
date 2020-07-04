package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_412_Test {
    Problem_412.Solver p = new Problem_412.Solver();

    @Test
    public void test1() {
        assertEquals(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), p.fizzBuzz(15));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList("1"), p.fizzBuzz(1));
    }
}
