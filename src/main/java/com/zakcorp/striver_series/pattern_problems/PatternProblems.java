package com.zakcorp.striver_series.pattern_problems;

public class PatternProblems
{
  StringBuilder sb;
  public PatternProblems() {
    sb = new StringBuilder();
  }
  public String pattern1(int n) {
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        sb.append( "*" );
        sb.append(" ");
      }
      sb.deleteCharAt( sb.length() - 1 );
      sb.append("\n");
    }
    sb.deleteCharAt( sb.length() - 1 );
    return sb.toString();
  }

  public String pattern2(int n) {
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        sb.append( "*" );
        sb.append(" ");
      }
      sb.deleteCharAt( sb.length() - 1 );
      sb.append("\n");
    }
    sb.deleteCharAt( sb.length() - 1 );
    return sb.toString();
  }

  public String pattern3(int n) {
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        sb.append( j );
        sb.append( " " );
      }
      sb.deleteCharAt( sb.length() - 1 );
      sb.append("\n");
    }
    sb.deleteCharAt( sb.length() - 1 );
    return sb.toString();
  }

  public String pattern4(int n) {
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        sb.append( i );
        sb.append( " " );
      }
      sb.deleteCharAt( sb.length() - 1 );
      sb.append("\n");
    }
    sb.deleteCharAt( sb.length() - 1 );
    return sb.toString();
  }

  public String pattern5(int n) {
    for(int i = 1; i <= n; i++) {
      for(int j = n; j >= i; j--) {
        sb.append( "*" );
        sb.append( " " );
      }
      sb.deleteCharAt( sb.length() - 1 );
      sb.append("\n");
    }
    sb.deleteCharAt( sb.length() - 1 );
    return sb.toString();
  }

  public String pattern6(int n) {
    for(int i = n; i >= 1; i--) {
      for(int j = 1; j <= i; j++) {
        sb.append( j );
        sb.append( " " );
      }
      sb.deleteCharAt( sb.length() - 1 );
      sb.append("\n");
    }
    sb.deleteCharAt( sb.length() - 1 );
    return sb.toString();
  }

  public String pattern7(int n) {
    int x = findNthOddNumber(n);
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= x; j++) {
        if(j == i - 1 && j == x) {

        }
        sb.append("*");
      }
      sb.append( "\n" );
    }
    sb.deleteCharAt( sb.length() - 1 );
    return sb.toString();
  }

  private int findNthOddNumber(int n) {
    int m = 1;
    for(int i = 1; i < Integer.MAX_VALUE; i+=2) {
      if(m == n) {
        return i;
      }
      m++;
    }
    return -1;
  }


}