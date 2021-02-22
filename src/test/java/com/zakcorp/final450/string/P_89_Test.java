package com.zakcorp.final450.string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class P_89_Test {
    P_89.Solver p = new P_89.Solver();
    @Test
    public void test1() {
        assertEquals( Arrays.asList("you have sleep", "you have eat","you have drink","you are sleep","you are eat",
                "you are drink","we have sleep","we have eat","we have drink","we are sleep","we are eat","we are drink") ,
                p.solve1(new String[][] { {"you", "we"},
                {"have", "are"},
                {"sleep", "eat", "drink"} }) );
    }
}
