package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Zakir
 * Question: Implement atoi
 * Result: Correct Answer
 * Execution Time: 0.43
 * TODO:
 */
public class MDGFG_Str08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String str = br.readLine();
            System.out.println(convertToInteger(str));
        }
    }

    private static int convertToInteger(String str) {
        if(str.startsWith("-")) {
            return Integer.valueOf(str);
        }
        char[] chArr = str.toCharArray();
        int sum = 0;
        int zeroAscii = (int)'0';
        for(char ch: chArr) {
            int tmpAscii = (int)ch;
            if(tmpAscii > 47 && tmpAscii < 58) {
                sum = (sum * 10) + (tmpAscii - zeroAscii);
            } else {
                return -1;
            }
        }
        return sum;
    }

}
