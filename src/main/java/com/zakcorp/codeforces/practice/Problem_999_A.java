package com.zakcorp.codeforces.practice;

import java.io.*;
import java.util.*;

public class Problem_999_A {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            Solver p = new Solver();
//            p.solve1(in, out);
//            p.solve2(in, out);
            p.solve3(in, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class Solver {
        public void solve1(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int k = in.readInt();
            LinkedList<Integer> ll = new LinkedList<>();
            for(int i = 0; i < n; i++) {
                ll.add(in.readInt());
            }
            int cnt = 0;
            boolean pF = true, pS = true;
            while( !ll.isEmpty() && (pF || pS)) {
                if(pF) {
                    if(ll.getFirst() <= k) {
                        cnt++;
                        ll.removeFirst();
                    } else {
                        pF = false;
                    }
                }
                if(pS) {
                    if(!ll.isEmpty() && ll.getLast() <= k) {
                        cnt++;
                        ll.removeLast();
                    } else {
                        pS = false;
                    }
                }
            }
            out.printLine(cnt);
            out.flush();
            out.close();
        }
        public void solve2(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int k = in.readInt();
            LinkedList<Integer> ll = new LinkedList<>();
            for(int i = 0; i < n; i++) {
                ll.addLast(in.readInt());
            }
            int cnt = 0;
            while( !ll.isEmpty() && ll.getFirst() <= k) {
                cnt++;
                ll.pollFirst();
            }
            while(!ll.isEmpty() && ll.getLast() <= k) {
                cnt++;
                ll.pollLast();
            }
            out.printLine(cnt);
            out.flush();
            out.close();
        }
        public void solve3(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int k = in.readInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.readInt();
            }
            int cnt = 0;
            int l = 0, h = n - 1;
            while(l <= h) {
                if(arr[l] <= k) {
                    cnt++;
                    l++;
                } else if(arr[h] <= k) {
                    cnt++;
                    h--;
                } else {
                    break;
                }
            }
            out.printLine(cnt);
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
