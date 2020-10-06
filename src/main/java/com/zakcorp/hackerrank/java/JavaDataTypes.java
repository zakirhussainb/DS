package com.zakcorp.hackerrank.java;

import java.util.Scanner;

public class JavaDataTypes {
    private static final int ONE_BYTE = 8;
    private static final int ONE_SHORT = 16;
    private static final int ONE_INT = 32;
    private static final int ONE_LONG = 64;
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            try {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if( x >= -Math.pow(2, ONE_BYTE - 1) && x < Math.pow(2, ONE_BYTE - 1) )
                    System.out.println("*  byte");
                if( x >= -Math.pow(2, ONE_SHORT - 1) && x < Math.pow(2, ONE_SHORT - 1) )
                    System.out.println("*  short");
                if( x >= -Math.pow(2, ONE_INT - 1) && x < Math.pow(2, ONE_INT - 1) )
                    System.out.println("*  int");
                if( x >= -Math.pow(2, ONE_LONG - 1) && x <= Math.pow(2, ONE_LONG - 1) )
                    System.out.println("*  long");
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
