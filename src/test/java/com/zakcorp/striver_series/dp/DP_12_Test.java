package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_12.*;

import org.junit.Test;

public class DP_12_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
//  Solver3 p3 = new Solver3();
//  Solver4 p4 = new Solver4();

  @Test
  public void test1()
  {
    assertEquals( 13, p1.minimumTotal(new int[][]{ {2,1,3},{6,5,4},{7,8,9} }) );
    assertEquals( 13, p2.minimumTotal(new int[][]{ {2,1,3},{6,5,4},{7,8,9} }) );
  }

  @Test
  public void test2()
  {
    assertEquals( -59, p1.minimumTotal(new int[][]{ {-19, 57},{-40, -5} }) );
    assertEquals( -59, p2.minimumTotal(new int[][]{ {-19, 57},{-40, -5} }) );
  }
}
