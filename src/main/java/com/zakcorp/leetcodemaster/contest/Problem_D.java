package com.zakcorp.leetcodemaster.contest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Problem_D {
    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";

    static void solve()
    {
        int n = ni();
        long C = nl();
        int[] h = na(n);

        // dp[i] = dp[j] + (h[j]-h[i])^2+C
        // dp[i] = dp[j] + h[j]^2 - h[j]*h[i]*2+h[i]^2+C
        long[] dp = new long[n];
        EnvelopeLinearDeque el = new EnvelopeLinearDeque(n);
        for(int i = 0;i < n;i++){
            if(i > 0){
                dp[i] = el.get(h[i])+(long)h[i]*h[i]+C;
            }

            el.add(-2L*h[i], dp[i]+(long)h[i]*h[i]);
        }
        out.println(dp[n-1]);
    }

    public static class EnvelopeLinearDeque {
        public long[] slopes, intercepts;
        public int f, b;

        public EnvelopeLinearDeque(int n)
        {
            slopes = new long[n];
            intercepts = new long[n];
            f = b = 0;
        }

        public long f(long x, int ind)
        {
            return slopes[ind]*x+intercepts[ind];
        }

        public double f(double x, int ind)
        {
            return slopes[ind]*x+intercepts[ind];
        }

        public long get(long x)
        {
            while(f-b > 1 && f(x, b) > f(x, b+1))b++;
            return f(x, b);
        }

        public void add(long slope, long intercept)
        {
            if(f-b > 0)assert slope <= slopes[f-1];
            if(f-b > 0 && slope == slopes[f-1] && intercept >= intercepts[f-1])return;

            while(f-b > 0){
                // sl*x+in = lsl*x+lin
                // (sl-lsl)*x = lin-in
                double x = (double)(intercept-intercepts[f-1])/(slopes[f-1]-slope);
                if(f-1-b > 0 && f(x, f-2) < f(x, f-1)){
                    f--;
                }else{
                    break;
                }
            }
            slopes[f] = slope;
            intercepts[f] = intercept;
            f++;
        }
    }



    public static void main(String[] args) throws Exception
    {
        long S = System.currentTimeMillis();
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        solve();
        out.flush();
        long G = System.currentTimeMillis();
        tr(G-S+"ms");
    }

    private static boolean eof()
    {
        if(lenbuf == -1)return true;
        int lptr = ptrbuf;
        while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;

        try {
            is.mark(1000);
            while(true){
                int b = is.read();
                if(b == -1){
                    is.reset();
                    return true;
                }else if(!isSpaceChar(b)){
                    is.reset();
                    return false;
                }
            }
        } catch (IOException e) {
            return true;
        }
    }

    private static byte[] inbuf = new byte[1024];
    static int lenbuf = 0, ptrbuf = 0;

    private static int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }

    private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    //	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
    private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

    private static double nd() { return Double.parseDouble(ns()); }
    private static char nc() { return (char)skip(); }

    private static String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private static char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private static char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private static int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private static int ni()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
