package com.zakcorp.leetcodemaster.contest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Problem_D {
    static class Solver {
        public long solve1(int[] arr, long z) {
            int n = arr.length;
            long count = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    int val = 0;
                    for (int k = i; k <= j; k++) {
                        val += arr[k];
                    }
                    int len = j - i + 1;
                    val = val * len;
                    if(val < z) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            return count;
        }
        public long solve2(int[] nums, long k) {
            if (k == 0) return 0;
            int cnt = 0;
            int sum = 0;
            for (int i = 0, j = 0; j < nums.length; j++) {
                sum += nums[j];
                int pro = sum * (j - i + 1);
                while (i <= j && pro < k) {
                    pro /= nums[i++];
                }
                cnt += j - i + 1;
            }
            return cnt;
        }
    }

}
