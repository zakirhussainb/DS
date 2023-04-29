package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_8.*;

import org.junit.Test;

public class DP_8_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
  Solver4 p4 = new Solver4();

  @Test
  public void test1()
  {
    assertEquals( 28, p1.uniquePaths(3, 7) );
    assertEquals( 28, p2.uniquePaths(3, 7) );
    assertEquals( 28, p3.uniquePaths(3, 7) );
    assertEquals( 28, p4.uniquePaths(3, 7) );
  }
}
