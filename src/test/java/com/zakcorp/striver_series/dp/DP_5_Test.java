package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_5.*;

import org.junit.Test;

public class DP_5_Test
{
  DP_5.Solver p = new Solver();
  DP_5.Solver1 p1 = new Solver1();
  DP_5.Solver2 p2 = new Solver2();
  @Test
  public void test1() {
    assertEquals(4, p.solve1( new int[]{1, 2, 3, 1} ) );
    assertEquals(4, p1.solve1( new int[]{1, 2, 3, 1} ) );
    assertEquals(4, p2.solve1( new int[]{1, 2, 3, 1} ) );
  }
}
