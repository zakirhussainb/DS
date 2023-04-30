package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_11.*;

import java.util.*;

import org.junit.Test;

public class DP_11_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
//  Solver3 p3 = new Solver3();
//  Solver4 p4 = new Solver4();

  @Test
  public void test1()
  {
    List<List<Integer>> input = new ArrayList<>();
    input.add( List.of( 2 ) );
    input.add( Arrays.asList( 3, 4 ) );
    input.add( Arrays.asList( 6, 5, 7 ) );
    input.add( Arrays.asList( 4, 1, 8, 3 ) );
    assertEquals( 11, p1.minimumTotal(input) );
    assertEquals( 11, p2.minimumTotal(input) );
  }
}
