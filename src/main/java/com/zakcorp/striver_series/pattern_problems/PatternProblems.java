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

}
