package com.zakcorp.codeforces.practice;

import java.io.*;
import java.util.InputMismatchException;

public class Problem_711_A {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        Solver p = new Solver();
        try {
            int n = in.readInt();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.readString();
            }
            p.solve1(arr, n, out);
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public void solve1(String[] arr, int n, OutputWriter out) {
            boolean present = false;
            for(int i = 0; i < n; i++) {
                if(arr[i].contains("OO")) {
                    present = true;
                    char[] chArr = arr[i].toCharArray();
                    for(int j = 0; j < chArr.length; j++) {
                        if(chArr[j] == 'O' && chArr[j + 1] == 'O') {
                            chArr[j] = '+';
                            chArr[j + 1] = '+';
                            break;
                        }
                    }
                    arr[i] = new String(chArr);
                    break;
                }
            }
            if(present) {
                out.printLine("YES");
            } else {
                out.printLine("NO");
                return;
            }
            for(int i = 0; i < n; i++) {
                out.printLine(arr[i]);
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
