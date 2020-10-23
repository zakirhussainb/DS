package com.zakcorp.gfgmaster.babbarsheet;

import java.io.*;
import java.util.InputMismatchException;

// ARRAY ROTATIONS
public class P7 {
    public static void main(String[] args) {
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
        // Plain Brute Force -> O(N * D) and O(1) -> TLE for very large inputs
        public void solve1(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.readInt();
            }
            int d = in.readInt();
            while(d --> 0) {
                int i = 0;
                int k = arr[i];
                while(i < n - 1) {
                    arr[i] = arr[i + 1];
                    i++;
                }
                arr[n - 1] = k;
            }
            for(int i = 0; i < n; i++) {
                out.print(arr[i] + " ");
            }
            out.printLine();
            out.flush();
            out.close();
        }
        // Optimized Solution -> O(N) and O(D) -> TLE for large inputs ex 10^5 -> Since creating a temp array of 10^5
        public void solve2(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.readInt();
            }
            int d = in.readInt();
            // Using temp array for "d"
            int[] temp = new int[d];
            for(int i = 0; i < d; i++) {
                temp[i] = arr[i];
            }
            for(int i = d; i < n; i++) {
                arr[i - d] = arr[i];
            }
            int m = n - d;
            int k = 0;
            while(m < n) {
                arr[m++] = temp[k++];
            }
            for(int i = 0; i < n; i++) {
                out.print(arr[i] + " ");
            }
            out.printLine();
            out.flush();
            out.close();
        }

        public void solve3(InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.readInt();
            }
            int d = in.readInt();
            if(d == 0)
                return;
            d = d % n;
            reverseArray(arr, 0, d - 1);
            reverseArray(arr, d, n - 1);
            reverseArray(arr, 0, n - 1);
            for(int i = 0; i < n; i++) {
                out.print(arr[i] + " ");
            }
            out.printLine();
            out.flush();
            out.close();
        }

        private void reverseArray(int[] arr, int start, int end) {
            while(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
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
