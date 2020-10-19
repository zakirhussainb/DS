package com.zakcorp.codeforces.practice;

import java.io.*;
import java.util.*;

public class Problem_978_C {
    public static void main(String[] args) throws Exception {
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
        long startRange = 1;
        public void solve1(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            long[] dorms = new long[n];
            for(int i = 0; i < n; i++) {
                dorms[i] = in.readLong();
            }
            LinkedList<Long> letters = new LinkedList<>();
            for(int j = 0; j < m; j++) {
                letters.add(in.readLong());
            }
            DormRange[] dorm = new DormRange[n];
            for(int i = 0; i < n; i++) {
                dorm[i] = getRange(dorms[i]);
            }
            for(int i = 0; i < n && !letters.isEmpty();) { // dorms
                if(letters.getFirst() >= dorm[i].start && letters.getFirst() <= dorm[i].end) { // letters
                    long dormNum = i + 1;
                    long roomNum = (dorm[i].end - dorm[i].start + 1) - (dorm[i].end - letters.getFirst());
                    out.printLine(dormNum + " " + roomNum);
//                    System.out.println(dormNum + " " + roomNum);
                    letters.removeFirst();
                } else {
                    i++;
                }
            }
            out.flush();
            out.close();
        }
        public DormRange getRange(long rooms) {
            DormRange rNum = new DormRange(startRange, startRange + rooms - 1);
            startRange = startRange + rooms;
            return rNum;
        }
        static class DormRange {
            long start;
            long end;
            public DormRange(long start, long end) {
                this.start = start;
                this.end = end;
            }
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
