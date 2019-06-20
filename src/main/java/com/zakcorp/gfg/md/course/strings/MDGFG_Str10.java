package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author : Zakir
 * Question:  Permutations of a given string
 * Result: Correct Answer
 * Execution Time: 0.07
 * TODO:
 *      The approach here is to use recursion.
 *      Step 1: Convert the given input string into a character array and sort it.
 *      Step 2: Iterate the string and initialize a character ch.
 *      Step 3: Take substring of the input string as follows:
 *              String res = str.substring(0, i) + str.substring(i + 1);
 *      Step 4: Recurse the function printAllPermutations(out, res + ch);
 *      Step 5: Check for the string.length to be zero. If yes, then print the result + " ";
 */
public class MDGFG_Str10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String str = br.readLine();
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String input = new String(chArr);
            printAllPermutations(input, "");
            System.out.println();
        }
    }

    private static void printAllPermutations(String str, String res) {
        if(str.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String out = str.substring(0, i) + str.substring(i + 1);
            printAllPermutations(out, res + ch);
        }
    }

}
