package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_7.*;

import org.junit.Test;

public class DP_7_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
  Solver4 p4 = new Solver4();
  @Test
  public void test1()
  {
//    assertEquals( 11, p1.maximumPoints( new int[][] { {1,2,5},{3,1,1},{3,3,3} } ) );
//    assertEquals( 11, p2.maximumPoints( new int[][] { {1,2,5},{3,1,1},{3,3,3} } ) );
//    assertEquals( 11, p3.maximumPoints( new int[][] { {1,2,5},{3,1,1},{3,3,3} } ) );
    assertEquals( 11, p4.maximumPoints( new int[][] { {1,2,5},{3,1,1},{3,3,3} } ) );
  }
}
