package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_6.*;

import org.junit.Test;

public class DP_6_Test
{
  Solver1 p1 = new Solver1();
  @Test
  public void test1() {
    assertEquals(4, p1.findMaxSum( new int[]{1, 2, 3, 1} ) );
//    assertEquals(4, p2.findMaxSum( new int[]{1, 2, 3, 1} ) );
//    assertEquals(4, p3.findMaxSum( new int[]{1, 2, 3, 1} ) );
  }

  @Test
  public void test2() {
    assertEquals(110, p1.findMaxSum( new int[]{5, 5, 10, 100, 10, 5} ) );
//    assertEquals(110, p2.findMaxSum( new int[]{5, 5, 10, 100, 10, 5} ) );
//    assertEquals(110, p3.findMaxSum( new int[]{5, 5, 10, 100, 10, 5} ) );
//    assertEquals(110, p4.findMaxSum( new int[]{5, 5, 10, 100, 10, 5} ) );
  }

  @Test
  public void test3() {
    assertEquals(2, p1.findMaxSum( new int[]{1, 2} ) );
//    assertEquals(2, p2.findMaxSum( new int[]{1, 2} ) );
//    assertEquals(2, p3.findMaxSum( new int[]{1, 2} ) );
  }

  @Test
  public void test4() {
    assertEquals(4, p1.findMaxSum( new int[]{1,2,3,1} ) );
  }
}
