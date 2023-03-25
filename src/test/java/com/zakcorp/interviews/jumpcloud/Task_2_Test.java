package com.zakcorp.interviews.jumpcloud;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task_2_Test
{
  Task_2.Solver t2 = new Task_2.Solver();
  @Test
  public void test1() {
    assertEquals(2, t2.solve1(new String[]{"toast", "bread", "breada", "cheese"},
                             "abcdeeehrs"));
  }
  @Test
  public void test2() {
    assertEquals(4, t2.solve1(new String[]{"az", "azz", "zza", "zzz", "zzzz"},
                              "azzz"));
  }
}
