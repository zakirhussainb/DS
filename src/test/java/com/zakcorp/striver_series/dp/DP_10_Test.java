package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_10.*;

import org.junit.Test;

public class DP_10_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
  Solver4 p4 = new Solver4();

  @Test
  public void test1()
  {
    assertEquals( 7, p1.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}) );
    assertEquals( 7, p2.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}) );
    assertEquals( 7, p3.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}) );
    assertEquals( 7, p4.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}) );
  }
}
