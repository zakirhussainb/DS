package com.zakcorp.interviews.jumpcloud;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task_1_Test {
  Task_1.Solver1 t1 = new Task_1.Solver1();
  @Test
  public void test1() {
    assertEquals(230, t1.solve1(new int[]{100, 100, 100, -10},
                             new String[]{"2020-12-31", "2020-12-22","2020-12-03","2020-12-29"}));
  }
  @Test
  public void test2() {
    assertEquals(25, t1.solve1(new int[]{180, -50, -25, -25},
                                new String[]{"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"}));
  }
  @Test
  public void test3() {
    assertEquals(-164, t1.solve1(new int[]{1, -1, -0, -105, 1},
                               new String[]{"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"}));
  }
  @Test
  public void test4() {
    assertEquals(80, t1.solve1(new int[]{100, 100, -10, -20, -30},
                                 new String[]{"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"}));
  }
  @Test
  public void test5() {
    assertEquals(-115, t1.solve1(new int[]{-60, 60, -40, -20},
                               new String[]{"2020-10-01", "2020-02-02", "2020-10-10", "2020-10-30"}));
  }
}
