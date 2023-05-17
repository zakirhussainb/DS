package com.zakcorp.striver_series.dp;

import static org.junit.Assert.*;

import com.zakcorp.striver_series.dp.DP_16.*;

import org.junit.Test;

public class DP_16_Test
{
  Solver1 p1 = new Solver1();
//  Solver2 p2 = new Solver2();
//  Solver3 p3 = new Solver3();
  Solver4 p4 = new Solver4();
  @Test
  public void test1() {
    assertEquals(1, p4.minimumDifference( new int[]{1, 6, 11, 5}) );
    assertEquals(1, p1.minimumDifference( new int[]{1, 6, 11, 5}) );
  }

  @Test
  public void test2() {
    assertEquals(3, p4.minimumDifference( new int[]{1, 4}) );
    assertEquals(3, p1.minimumDifference( new int[]{1, 4}) );
  }

  @Test
  public void test3() {
    assertEquals(2, p4.minimumDifference( new int[]{3, 9, 7, 3}) );
    assertEquals(2, p1.minimumDifference( new int[]{3, 9, 7, 3}) );
  }

  @Test
  public void test4() {
    assertEquals(72, p1.minimumDifference( new int[]{-36, 36}) );
  }
}
