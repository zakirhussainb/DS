package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_18.*;

import org.junit.Test;

public class DP_18_Test
{
//  Solver1 p1 = new Solver1();
//  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
//  Solver4 p4 = new Solver4();
  @Test
  public void test1() {
    assertEquals(1, p3.countPartitions( new int[]{1, 2, 3, 4, 5}, 10) );
  }
}
