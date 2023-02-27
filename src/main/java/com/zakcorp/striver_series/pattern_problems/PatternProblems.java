package com.zakcorp.striver_series.pattern_problems;

public class PatternProblems
{
  /*
  https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
   */
  private StringBuilder sb;
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

  public void pattern7(int n) {
    // Find how many rows must be printed -> n = 5, then 5 rows
    // Find how many columns must be printed and what should be there in those columns ? -> Spaces, Stars, Spaces
    for(int i = 0; i < n; i++) {
      // Spaces
      int spaces = n - i - 1; // 5 - 0 - 1 = 4, 5 - 1 - 1 = 3, 5 - 2 - 1 = 2, etc.
      for(int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }

      // Stars
      int stars = 2 * i + 1; // 2 * 0 + 1 = 1, 2 * 1 + 1 = 3, 2 * 2 + 1 = 5
      for(int j = 0; j < stars; j++) {
        System.out.print("*");
      }

      // Spaces
      for(int j = 1; j < spaces; j++) {
        System.out.print(" ");
      }

      System.out.println();
    }
  }

  public void pattern8(int n) {
    for(int i = n - 1; i >= 0; i--) {
      // Spaces
      int spaces = n - i - 1;
      for(int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }

      // Stars
      int stars = 2 * i + 1;
      for(int j = 0; j < stars; j++) {
        System.out.print("*");
      }

      // Spaces
      for(int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }

      System.out.println();
    }
  }

  public void pattern9(int n) {
    pattern7( n );
    pattern8( n );
  }

  public void pattern10(int n) {
    int x = 2 * n - 1;
    for(int i = 1; i <= x; i++) {
      int stars = i;
      if(i > n)
        stars = 2 * n - i;
      for(int j = 0; j < stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void pattern11(int n) {
    int start = 1;
    for(int i = 0; i < n; i++) {
      start = (i % 2 == 0) ? 1 : 0;
      for(int j = 0; j <= i; j++) {
          System.out.print(start);
          start = 1 - start;
      }
      System.out.println();
    }
  }

  public void pattern12(int n) {
    for(int i = 1; i <= n; i++) {
      // Number
      for(int j = 1; j <= i; j++) {
        System.out.print(j);
      }

      // Spaces
      int spaces = 2 * (n - i);
      for(int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // Number
      for(int j = i; j >= 1; j--) {
        System.out.print(j);
      }

      System.out.println();
    }
  }

  public void pattern13(int n) {
    int num = 1;
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print(num);
        System.out.print(" ");
        num++;
      }
      System.out.println();
    }
  }

  public void pattern14(int n) {
    for(int i = 0; i < n; i++) {
      char letter = 'A';
      for(int j = 0; j <= i; j++) {
        System.out.print(letter);
        letter++;
      }
      System.out.println();
    }
  }

  public void pattern15(int n) {
    for(int i = n - 1; i >= 0; i--) {
      char letter = 'A';
      for(int j = 0; j <= i; j++) {
        System.out.print(letter);
        letter++;
      }
      System.out.println();
    }
  }

  public void pattern16(int n) {
    char letter = 'A';
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print(letter);
      }
      letter++;
      System.out.println();
    }
  }

  public void pattern17(int n) {
    for(int i = 0; i < n; i++) {
      // Spaces
      int spaces = n - i - 1;
      for(int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      // Letters
      int letters = 2 * i + 1;
      char letter = 'A';
      for(int j = 1; j <= letters; j++) {
        System.out.print(letter);
        if(j > letters / 2) {
          letter--;
        } else {
          letter++;
        }
      }

      // Spaces
      for(int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      System.out.println();
    }
  }

  public void pattern18(int n) {
    for(int i = 0; i <= n; i++) {
      char startCh = (char)('A' + (n - i));
      for(int j = 1; j <= i; j++) {
        System.out.print(startCh);
        startCh++;
      }
      System.out.println();
    }
  }

  public void pattern19(int n)
  {
    // This is a symmetry pattern problem
    // Solve for both the symmetries separately.

    // 1. Solving for Upper symmetry
    for ( int i = 0; i < n; i++ )
    {
      // stars
      int stars = n - i;
      for ( int j = 0; j < stars; j++ )
      {
        System.out.print( "*" );
      }

      // spaces
      int spaces = 2 * i;
      for ( int j = 0; j < spaces; j++ )
      {
        System.out.print( " " );
      }

      // stars
      for ( int j = 0; j < stars; j++ )
      {
        System.out.print( "*" );
      }

      System.out.println();
    }

    // 2. Solving for Lower symmetry
    for ( int i = n - 1; i >= 0; i-- )
    {
      // stars
      int stars = n - i;
      for ( int j = 0; j < stars; j++ )
      {
        System.out.print( "*" );
      }

      // spaces
      int spaces = 2 * i;
      for ( int j = 0; j < spaces; j++ )
      {
        System.out.print( " " );
      }

      // stars
      for ( int j = 0; j < stars; j++ )
      {
        System.out.print( "*" );
      }

      System.out.println();
    }
  }
}
