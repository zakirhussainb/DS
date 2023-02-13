package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Problem_1023_Test
{
    Problem_1023.Solver p = new Problem_1023.Solver();
    @Test
    public void test1() {
        assertEquals( Arrays.asList(true,false,true,true,false),
                      p.solve1( new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FB"));
    }
    @Test
    public void test2() {
        assertEquals( Arrays.asList(true,false,true,false,false),
                      p.solve1( new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FoBa"));
    }
    @Test
    public void test3() {
        assertEquals( Arrays.asList(false,true,false,false,false),
                      p.solve1( new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FoBaT"));
    }
    @Test
    public void test4() {
        assertEquals( Arrays.asList(false,false,true),
                      p.solve1( new String[]{"CompetitiveProgramming","CounterPick","ControlPanel"}, "CooP"));
    }
}
