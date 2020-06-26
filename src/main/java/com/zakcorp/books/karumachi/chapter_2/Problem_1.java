package com.zakcorp.books.karumachi.chapter_2;

public class Problem_1 {
    /**
     * Tower Of Hanoi for "N" disks using 1 auxiliary rod.
     */
    public static void main(String[] args) {
        Problem_1 p = new Problem_1();
        int n = 4;
        p.towerOfHanoi(n, 'P', 'Q', 'R');
    }
    private void towerOfHanoi(int n, char P, char Q, char R) {
        if(n > 0) {
            towerOfHanoi(n - 1, P, R, Q);
//            System.out.println("Move disk " + n + " from " + P + " to " + R);
            System.out.println("(" +P+ ", " +R+ ")");
            towerOfHanoi(n - 1, Q, P, R);
        }
    }
}
