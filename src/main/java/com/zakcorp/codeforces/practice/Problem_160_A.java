package com.zakcorp.codeforces.practice;

import java.io.*;
import java.util.*;

public class Problem_160_A {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            Solver p = new Solver();
//            p.solve1(in, out);
            p.solve2(in, out);

            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class Solver {
        public void solve1(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.readInt();
            }
            int count = 0;
            Arrays.sort(arr);
            int sum = 0;
            for(int i = n - 1; i > 0; i--) {
                sum += arr[i];
                if(sum > calcSum(arr,  i - 1)) {
                    count = n - i;
                    break;
                }
            }
            out.printLine(count == 0 ? n : count);
        }
        private int calcSum(int[] arr, int e) {
            int sum = 0;
            for(int i = 0; i <= e; i++) {
                sum += arr[i];
            }
            return sum;
        }
        public void solve2(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++) {
                arr[i] = in.readInt();
                sum += arr[i];
            }
            Arrays.sort(arr);
            int total = 0;
            for(int i = n - 1; i >= 0; i--) {
                total += arr[i];
                sum -= arr[i];
                if(total > sum) {
                    out.printLine(n - i);
                    return;
                }
            }
            out.printLine(n);
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
