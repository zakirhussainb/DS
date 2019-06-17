package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Zakir
 * Question: Roman Number to Integer
 * Result:
 * Execution Time:
 * TODO:
 *     Step 1: Use substring.
 *     Step 2: Check for clockwise rotation, if unmatched then also check for anti-clockwise rotation.
 */
public class MDGFG_Str06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String roman = br.readLine();
            System.out.println(convertRomanToInteger(roman));
        }
    }

    private static int convertRomanToInteger(String roman) {
        int result = 0;
        System.out.println("rom...len..." + roman.length());
        // IV
        for(int i = 0 ; i < roman.length(); i++) {
            int s1 = value(roman.charAt(i));
            if(i + 1 < roman.length()) {
                int s2 = value(roman.charAt(i + 1));
                if(s1 >= s2) {
                    result = result + s1;
                } else {
                    result = result + s2 - s1;
                    i++;
                }
            }
            else {
                result = result + s1;
                i++;
            }
        }
        return result;
    }

    private static int value(char ch) {
        if(ch == 'I')
            return 1;
        if(ch == 'V')
            return 5;
        if(ch == 'X')
            return 10;
        if(ch == 'L')
            return 50;
        if(ch == 'C')
            return 100;
        if(ch == 'D')
            return 500;
        if(ch == 'M')
            return 1000;
        return -1;
    }

}
