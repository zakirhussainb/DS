package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Comparator;

public class Problem_2389 {
    static class Solver {
        public int[] solve1(int[] arr, int[] queries) {
            Arrays.sort(arr);
            int n = arr.length;
            long[] ps = new long[n];
            long[] ss = new long[n];
            ps[0] = arr[0];
            ss[n-1]=arr[n-1];
            for(int i=1;i<n;i++){
                ps[i]=arr[i]+ps[i - 1];
            }
            for(int i=n-2;i>=0;i--){
                ss[i]=arr[i]+ss[i + 1];
            }
            int m=queries.length;
            int[] res = new int[m];
            for(int i=0;i<m;i++){
                int psSize = 0;
                for(int j=0;j<n;j++){
                    if (ps[j] <= queries[i]) {
                        psSize++;
                    }
                }
                int ssSize = 0;
                for(int k=n-1;k>=0;k--){
                    if (ss[k] <= queries[i]) {
                        ssSize++;
                    }
                }
                res[i] = Math.max(psSize, ssSize);
            }
            return res;
        }
        public int[] solve2(int[] arr, int[] queries) {
            Arrays.sort(arr);
            int n = arr.length;
            int[] ps = new int[n];
            ps[0] = arr[0];
            for(int i=1;i<n;i++){
                ps[i]=arr[i]+ps[i - 1];
            }
            int m=queries.length;
            int[] res = new int[m];
            for(int i=0;i<m;i++){
                res[i] = binarySearch(ps, queries[i]);
            }
            return res;
        }
        static int binarySearch(int[] ps, int query) {
            int l = 0;
            int r = ps.length - 1;
            while(l <= r) {
                int m = l + (r - l) / 2;
                if(ps[m] == query) {
                    return m + 1;
                } else if(ps[m] > query) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
            return l;
        }
    }
}
