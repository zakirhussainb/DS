package com.zakcorp.hackerrank.contest.hackfest2020;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by Zakir Hussain B on 09/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class CyclicBinaryString {
    public static class Solver {
        public int solve1(String str) {
            // 0011
            int shift = str.length();
            int maxPower = Integer.MIN_VALUE;
            while(shift --> 0) {
                int dec = Integer.parseInt(str, 2);
                int A = dec >> 1;
                int B = dec << (3);
                int value = A | B;
                System.out.println(value);
                for(int i = 0; i < dec; i++) {
                    if(dec % (int) Math.pow(2, i) == 0) {
                        maxPower = Math.max(maxPower, i);
                    } else {
                        break;
                    }
                }
            }
            return maxPower;
        }

    }
}