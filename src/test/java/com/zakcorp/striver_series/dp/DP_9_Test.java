package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_9.*;

import org.junit.Test;

public class DP_9_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
//  Solver3 p3 = new Solver3();
//  Solver4 p4 = new Solver4();

  @Test
  public void test1()
  {
    assertEquals( 2, p1.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}) );
    assertEquals( 2, p2.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}) );
  }
}
