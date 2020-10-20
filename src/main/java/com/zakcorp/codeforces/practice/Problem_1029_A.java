package com.zakcorp.codeforces.practice;

import java.io.*;
import java.util.*;

public class Problem_1029_A {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            Solver p = new Solver();
//            p.solve1(in, out);
            p.solve2(in, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class Solver {
        public void solve1(InputReader in, OutputWriter out) {
            /*int n = in.readInt();
            int k = in.readInt();
            String t = in.readString();
            String ans = t;
            int pos = 1;
            int cnt = 1;
            while(cnt < k) {
                if(pos >= ans.length()) {
                    ans += t;
                    cnt++;
                    pos++;
                } else if() {

                }
            }



//            out.printLine(sb.toString());
            out.flush();
            out.close();*/
        }
        public void solve2(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int k = in.readInt();
            String t = in.readString();
            int len = getPeriodLength(t, n);
            StringBuilder sb = new StringBuilder();
            k--;
            while(k --> 0) {
                sb.append(t, 0, len);
            }
            sb.append(t);
            out.printLine(sb.toString());
            out.flush();
            out.close();
        }
        /*
        The other idea is the following: we have to find the period of the string 𝑡.
        Let this period will be 𝑝. Then the answer is 𝑝 repeated 𝑘−1 times and 𝑡.
        The period of the string 𝑠 is the minimum prefix of this string such that we
        can repeat this prefix infinite number of times so the prefix of this infinite
        string will be 𝑠. For example,
        1. the period of the string 𝑎𝑏𝑎𝑏𝑎 is 𝑎𝑏,
        2. the period of the string 𝑎𝑏𝑐 is 𝑎𝑏𝑐 and 3. the period of the string 𝑎𝑎𝑎𝑎𝑎 is 𝑎.
        The period of the string can be found using prefix-function of the string or in 𝑂(𝑛2) naively.
         */
        private int getPeriodLength(String t, int n) {
            int[] arr = new int[n];
            for (int i = 1; i < n; ++i) {
                int j = arr[i - 1];
                while (j > 0 && t.charAt(j) != t.charAt(i))
                    j = arr[j - 1];
                if (t.charAt(i) == t.charAt(j))
                    ++j;
                arr[i] = j;
            }
            return n - arr[n - 1];
        }
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
        public long readLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }

        public int[] readIntArray(InputReader in, int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
                array[i] = in.readInt();
            return array;
        }
    }
    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object...objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }

        public void printLine(Object...objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void flush() {
            writer.flush();
        }

    }
}
