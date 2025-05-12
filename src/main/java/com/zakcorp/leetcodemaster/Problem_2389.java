package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Comparator;

public class Problem_2389 {
    static class Solver {
        public int[] solve1(int[] arr, int[] queries) {
            Arrays.sort(arr);
//            System.out.println(Arrays.toString(arr));
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
//            System.out.println("ps." + Arrays.toString(ps));
//            System.out.println("ss." + Arrays.toString(ss));
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
//            System.out.println("res."+Arrays.toString(res));
            return res;
        }
        public int[] solve2(int[] arr, int[] queries) {

        }
    }
}
