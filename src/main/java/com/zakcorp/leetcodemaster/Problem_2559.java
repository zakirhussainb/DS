package com.zakcorp.leetcodemaster;

public class Problem_2559 {
    static class Solver {
        public int[] solve1(String[] words, int[][] queries) {
            int n=words.length;
            int[] pre = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++){
                int m=words[i].length();
                if( (words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e'|| words[i].charAt(0) == 'i'|| words[i].charAt(0) == 'o'|| words[i].charAt(0) == 'u') &&
                    (words[i].charAt(m-1) == 'a' || words[i].charAt(m-1) == 'e'|| words[i].charAt(m-1) == 'i'|| words[i].charAt(m-1) == 'o'|| words[i].charAt(m-1) == 'u')  ) {
                    sum += 1;
                } else {
                    sum += 0;
                }
                pre[i] += sum;
            }
//            System.out.println("pre" + Arrays.toString(pre));
            int m = queries.length;
            int[] res = new int[m];
            for(int i=0;i<m;i++){
                int start = queries[i][0];
                int end = queries[i][1];
                if (start != 0) {
                    res[i] = pre[end] - pre[start - 1];
                } else {
                    res[i] = pre[end];
                }
            }
//            System.out.println("res" + Arrays.toString(res));
            return res;
        }
    }
}
