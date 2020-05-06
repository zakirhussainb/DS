package com.zakcorp.codechef.beginner;

import java.io.*;

class NITIKA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0) {
            String str = br.readLine();
            String[] splitArr = str.split("\\s+");
            int n = splitArr.length;
            bw.write(new Solver().solve(splitArr, n));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    static class Solver {
        public String solve(String[] splitArr, int n) {
            StringBuilder sb = new StringBuilder();
            if(n < 2) {
                sb.append(splitArr[0].substring(0, 1).toUpperCase()).append(splitArr[0].substring(1).toLowerCase());
                return sb.toString();
            }
            for(int i = 0; i < n - 1; i++) {
                sb.append(splitArr[i].substring(0,1).toUpperCase());
                sb.append(".").append(" ");
            }
            sb.append(splitArr[n - 1].substring(0, 1).toUpperCase()).append(splitArr[n - 1].substring(1).toLowerCase());
            return sb.toString();
        }
    }
}

