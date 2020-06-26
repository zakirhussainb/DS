package com.zakcorp.books.karumachi;

public class SumOfNNatural {
    // Recursion - Taken from abdul Bari notes
    public static void main(String[] args) {
        SumOfNNatural p = new SumOfNNatural();
        System.out.println("recur..." + p.recursiveSol(5));
        System.out.println("formula..." + p.formulaSol(5));
        System.out.println("iter..." + p.iterativeSol(5));
    }
    public int recursiveSol(int num) {
        if(num <= 0) {
            return num;
        } else {
            return recursiveSol(num - 1) + num;
        }
    }
    public int formulaSol(int num) {
        if(num <= 0) {
            return 0;
        }
        return (num * (num + 1)) / 2;
    }
    public int iterativeSol(int num) {
        if(num <= 0){
            return num;
        }
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
