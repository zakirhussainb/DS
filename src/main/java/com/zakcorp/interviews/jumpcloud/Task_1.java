package com.zakcorp.interviews.jumpcloud;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
//  static class Solver {
//    static class TransactionInfo {
//      public TransactionInfo( int month, boolean isCardPayment, int noOfCardPayments, int cardPaymentAmount,
//                              int incomingTransfer, String date )
//      {
//        this.month = month;
//        this.isCardPayment = isCardPayment;
//        this.noOfCardPayments = noOfCardPayments;
//        this.cardPaymentAmount = cardPaymentAmount;
//        this.incomingTransfer = incomingTransfer;
//        this.date = date;
//      }
//
//      int month;
//      boolean isCardPayment;
//      int noOfCardPayments;
//      int cardPaymentAmount;
//      int incomingTransfer;
//      String date;
//
//    }
//    public int solve1(int[] A, String[] D) {
//      Map<Integer, TransactionInfo> map = new HashMap<>();
//      int totalCost = 0;
//      for(int i = 0; i < A.length; i++) {
//        int month = Integer.parseInt( D[i].substring( 5, 7 ) );
//        if(map.containsKey( month )) {
//          TransactionInfo eT = map.get( month );
//          if(A[i] < 0) {
//
//          } else {
//
//          }
//        } else {
//          boolean isCardPayment = false;
//          int noOfCardPayments = 0;
//          int cardPaymentAmount = 0;
//          int incomingTransfer = 0;
//          String date = D[i];
//          if(A[i] < 0) {
//            isCardPayment = true;
//            noOfCardPayments++;
//            cardPaymentAmount = A[i];
//          } else {
//            incomingTransfer = A[i];
//          }
//          TransactionInfo ti = new TransactionInfo( month, isCardPayment, noOfCardPayments, cardPaymentAmount,
//                                                    incomingTransfer, date);
//          map.put(month, ti);
//        }
//
//        totalCost += A[i];
//      }
//
//      int noOfMonthsToBeIncluded = 12;
//      int transactionFee = 5;
//      noOfMonthsToBeIncluded -= getExcludedMonthsCount(map);
//      return totalCost - ( transactionFee * noOfMonthsToBeIncluded);
//    }
//  }

  static class Solver1 {
    static class TransactionInfo {
      int month;
      int noOfCardPayments;
      int cardPaymentAmount;

      public TransactionInfo( int month, int noOfCardPayments, int cardPaymentAmount )
      {
        this.month = month;
        this.noOfCardPayments = noOfCardPayments;
        this.cardPaymentAmount = cardPaymentAmount;
      }
    }
    public int solve1(int[] A, String[] D) {
      int cost = 0;
      Map<Integer, TransactionInfo> map = new HashMap<>();
      for(int i = 0; i < A.length; i++) {
        int month = Integer.parseInt( D[i].substring( 5, 7 ) );
        if(map.containsKey( month)) {
          TransactionInfo ti = map.get( month );
          if(A[i] < 0) {
            ti.cardPaymentAmount += A[i];
            ti.noOfCardPayments += 1;
            map.put(month, ti);
          }
        } else {
          if(A[i] < 0) {
            map.put(month, new TransactionInfo( month, 1, A[i] ) );
          }
        }
        cost += A[i];
      }
      int excludedMonths = 0;
      for(Map.Entry<Integer, TransactionInfo> entry : map.entrySet()) {
        TransactionInfo ti = entry.getValue();
        if(ti.noOfCardPayments >= 3) {
          int amount = -ti.cardPaymentAmount;
          if(amount >= 100) {
            excludedMonths++;
          }
        }
      }
      int noOfMonthsToBeIncluded = 12;
      int transactionFee = 5;
      noOfMonthsToBeIncluded -= excludedMonths;
      return cost - ( transactionFee * noOfMonthsToBeIncluded);
    }
  }
}
