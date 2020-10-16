package com.zakcorp.codeforces.practice;

import java.io.*;
import java.util.*;

public class Problem_339_A {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            String str1 = in.readString();
            Solver p = new Solver();
//            out.printLine(p.solve1(str1));
            out.printLine(p.solve2(str1));
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve1(String str) {
            int n = str.length();
            if(n == 1) {
                return str;
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) != '+') {
                    pq.add(str.charAt(i) - '0');
                }
            }
            StringBuilder sb = new StringBuilder();
            while(!pq.isEmpty()) {
                sb.append(pq.remove());
                if(!pq.isEmpty()) {
                    sb.append("+");
                }
            }
            return sb.toString();
        }
        static class MyComparator implements Comparator<Integer>{

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        }
        public String solve2(String str) {
            int n = str.length();
            if(n == 1) {
                return str;
            }
            int[] counter = new int[4];
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) != '+') {
                    counter[str.charAt(i) - '0']++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 4; i++) {
                while(counter[i] --> 0) {
                    sb.append(i).append("+");
                }
            }
            return sb.deleteCharAt(sb.length() - 1).toString();
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
