package com.zakcorp.striver_series.pattern_problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatternProblems_Test
{
  PatternProblems p = new PatternProblems();
  @Test
  public void pattern1() {
    String s = "* * * * *\n" +
               "* * * * *\n" +
               "* * * * *\n" +
               "* * * * *\n" +
               "* * * * *";
    assertEquals(s, p.pattern1(5));
  }
  @Test
  public void pattern2() {
    String s = "*\n" +
               "* *\n" +
               "* * *\n" +
               "* * * *\n" +
               "* * * * *";
    assertEquals(s, p.pattern2(5));
  }
  @Test
  public void pattern3() {
    String s = "1\n" +
               "1 2\n" +
               "1 2 3\n" +
               "1 2 3 4\n" +
               "1 2 3 4 5";
    assertEquals(s, p.pattern3(5));
  }

  @Test
  public void pattern4() {
    String s = "1\n" +
               "2 2\n" +
               "3 3 3\n" +
               "4 4 4 4\n" +
               "5 5 5 5 5";
    assertEquals(s, p.pattern4(5));
  }

  @Test
  public void pattern5() {
    String s = "* * * * *\n" +
               "* * * *\n" +
               "* * *\n" +
               "* *\n" +
               "*";
    assertEquals(s, p.pattern5(5));
  }

  @Test
  public void pattern6() {
    String s = "1 2 3 4 5\n" +
               "1 2 3 4\n" +
               "1 2 3\n" +
               "1 2\n" +
               "1";
    assertEquals(s, p.pattern6(5));
  }

  @Test
  public void pattern7() {
    p.pattern7(5);
  }

  @Test
  public void pattern8() {
    p.pattern8(5);
  }

  @Test
  public void pattern9() {
    p.pattern9(5);
  }

  @Test
  public void pattern10() {
    p.pattern10(5);
  }

  @Test
  public void pattern11() {
    p.pattern11(5);
  }
}
