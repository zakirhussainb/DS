package com.zakcorp.codechef.beginner;
import java.io.*;
import java.util.*;
class FLOW014 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = null;
    static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static long nextLong() {
        return Long.parseLong(next());
    }

    static float nextFloat() {
        return Float.parseFloat(next());
    }
    public static void main(String[] args) throws Exception {
        try {
            int tc = nextInt();
            while(tc --> 0) {
                int hardness = nextInt();
                float carbonContent = nextFloat();
                int tensileStrength = nextInt();
                bw.write( new Solver().solve(hardness, carbonContent, tensileStrength) + "\n");
            }
            bw.flush();
        } catch (Exception e){}
    }
    static class Solver {
        public int solve(int hn, float cc, int ts) {
            int res = 5;
            if(hn > 50 && cc < 0.7 && ts > 5600){
                res = 10;
            } else if(hn > 50 && cc < 0.7 && !(ts > 5600) ) {
                res = 9;
            } else if( !(hn > 50) && cc < 0.7 && ts > 5600 ) {
                res = 8;
            } else if(hn > 50 && !(cc < 0.7) && ts > 5600 ) {
                res = 7;
            } else if(hn > 50 || cc < 0.7 || ts > 5600) {
                res = 6;
            }
            return res;
        }
    }
}

