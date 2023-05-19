package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_21.*;

import org.junit.Test;

public class DP_21_Test
{
//  Solver1 p1 = new Solver1();
//  Solver2 p2 = new Solver2();
//  Solver3 p3 = new Solver3();
  Solver5 p5 = new Solver5();
  Solver6 p6 = new Solver6();
  @Test
  public void test1() {
    assertEquals(5, p5.findTargetSumWays(new int[]{1,1,1,1,1}, 3) );
    assertEquals(5, p6.findTargetSumWays(new int[]{1,1,1,1,1}, 3) );
  }

}
