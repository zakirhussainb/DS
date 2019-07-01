package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author : Zakir
 * Question:  Longest Common Substring
 * Result:
 * Execution Time:
 * TODO:
 *      1. The Problem can be solved in two ways:-
 *          1. Iterative Approach:- This works fine
 *              Step 1:
 *          2. Recursive Approach:- Here this would fail for the following Input
 *              1
 *              83 86
 *              LRBBMQBHCDARZOWKKYHIDDQSCDXRJMOWFRXSJYBLDBEFSARCBYNECDYGGXXPKLORELLNMPAPQFWKHOPKMCO
 *              QHNWNKUEWHSQMGBBUQCLJJIVSWMDKQTBXIXMVTRRBLJPTNSNFWZQFJMAFADRRWSOFSBCNUVQHFFBSAQXWPQCAC
 *
 */
public class MDGFG_Str11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String line = br.readLine();
            String[] str = line.split("\\s+");
            String str1 = br.readLine();
            String str2 = br.readLine();
            int n = str1.length();
            int m = str2.length();
            System.out.println(LCSubStr(str1.toCharArray(), str2.toCharArray(), n, m));
//            getLongestCommonSubstring(str1, str2);
        }
    }
    private static int LCSubStr(char X[], char Y[], int m, int n)
    {
        // Create a table to store lengths of longest common suffixes of
        // substrings. Note that LCSuff[i][j] contains length of longest
        // common suffix of X[0..i-1] and Y[0..j-1]. The first row and
        // first column entries have no logical meaning, they are used only
        // for simplicity of program
        int[][] LCStuff = new int[m + 1][n + 1];
        int result = 0; // To store length of the longest common substring

        // Following steps build LCSuff[m+1][n+1] in bottom up fashion
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (i == 0 || j == 0)
                    LCStuff[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                {
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result, LCStuff[i][j]);
                }
                else
                    LCStuff[i][j] = 0;
            }
        }
        return result;
    }

}
