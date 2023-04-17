package com.zakcorp.striver_series.arrays.hard;

import static org.junit.Assert.assertArrayEquals;

import com.zakcorp.striver_series.arrays.hard.MissingAndRepeatingNo.Solver;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Test_MissingAndRepeatingNo {

  MissingAndRepeatingNo.Solver p = new Solver();

  @Test
  public void test1() {
    assertArrayEquals(new int[]{3, 4}, p.missingAndRepeating( new ArrayList<>(Arrays.asList( 5, 4, 2, 4, 1 )), 5 ));
  }
}
