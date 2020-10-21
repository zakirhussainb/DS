package com.zakcorp.codeforces.practice;

import java.io.*;
import java.util.*;

public class Problem_1433_A {
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
        final static Map<Integer, Integer> map = new HashMap<>();
        static {
            map.put(1, 1);map.put(11, 3);map.put(111, 6);map.put(1111, 10);
            map.put(2, 11);map.put(22, 13);map.put(222, 16);map.put(2222, 20);
            map.put(3, 21);map.put(33, 23);map.put(333, 26);map.put(3333, 30);
            map.put(4, 31);map.put(44, 33);map.put(444, 36);map.put(4444, 40);
            map.put(5, 41);map.put(55, 43);map.put(555, 46);map.put(5555, 50);
            map.put(6, 51);map.put(66, 53);map.put(666, 56);map.put(6666, 60);
            map.put(7, 61);map.put(77, 63);map.put(777, 66);map.put(7777, 70);
            map.put(8, 71);map.put(88, 73);map.put(888, 76);map.put(8888, 80);
            map.put(9, 81);map.put(99, 83);map.put(999, 86);map.put(9999, 90);
        }
        public void solve1(InputReader in, OutputWriter out) {
            int t = in.readInt();
            while(t --> 0) {
                int x = in.readInt();
                out.printLine(map.get(x));
            }
            out.flush();
            out.close();
        }

        public void solve2(InputReader in, OutputWriter out) {
            int t = in.readInt();
            while(t --> 0) {
                String x = in.readString();
                int dig = x.charAt(0) - '0';
                int len = x.length();
                // Apply the formula
                int noOfTimes = (len * (len + 1)) / 2;
                int res = 10 * (dig - 1) + noOfTimes;
                out.printLine(res);
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
