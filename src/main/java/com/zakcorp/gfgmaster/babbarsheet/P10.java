package com.zakcorp.gfgmaster.babbarsheet;

import java.io.*;
import java.util.*;

public class P10 {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            Solver p = new Solver();
            p.solve1(in, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class Solver {
        public void solve1(InputReader in, OutputWriter out) {
            int tc = in.readInt();
            while(tc --> 0) {
                int k = in.readInt();
                int n = in.readInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                    arr[i] = in.readInt();
                }
                Arrays.sort(arr);
                // Initialize the result
                int result = arr[n - 1] - arr[0];

                // Handle corner elements
                int small = arr[0] + k;
                int big = arr[n - 1] - k;
                if(small > big) {
                    int temp = small;
                    small = big;
                    big = temp;
                }

                // Traverse Middle Elements
                for(int i = 1; i < n - 1; i++) {
                    int subtract = arr[i] - k;
                    int add = arr[i] + k;

                    if(subtract >= small || add <= big)
                        continue;

                    if(big - subtract <= add - small)
                        small = subtract;
                    else
                        big = add;
                }
                out.printLine(Math.min(result, big - small));
            }
            out.flush();
            out.close();
        }
        public void solve2(InputReader in, OutputWriter out) {
            int tc = in.readInt();
            while(tc --> 0) {
                int k = in.readInt();
                int n = in.readInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.readInt();
                }
                Arrays.sort(arr);
                int result = arr[n - 1] - arr[0];
                for (int i = 1; i < n; ++i) {
                    final int min = Math.min(arr[0] + k, arr[i] - k);
                    final int max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
                    result = Math.min(result, max - min);
                }
                out.printLine(result);
            }
            out.flush();
            out.close();
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
