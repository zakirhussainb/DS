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
            StringBuilder sb = new StringBuilder(str);
            while(shift --> 0) {
                char ch = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, ch);
                int dec = Integer.parseInt(sb.toString(), 2);
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
        public static int circularShift(int num, int k, boolean leftShift)
        {
            /*// left shift by k
            if (leftShift) {
                return (n << k) | (n >> (Integer.SIZE - k));
            }
            // right shift by k
            return (n >> k) | (n << (Integer.SIZE - k));*/
            int dropped_lsb;
            dropped_lsb = num & 1;
            num = (num >> 1) & (~(1 << Integer.SIZE));
            num = num | (dropped_lsb << Integer.SIZE);
            return num;
        }

    }
}