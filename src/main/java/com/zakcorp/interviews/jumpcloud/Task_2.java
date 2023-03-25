package com.zakcorp.interviews.jumpcloud;

import java.util.HashMap;
import java.util.Map;

public class Task_2
{
  static class Solver {
    public int solve1(String[] A, String S) {
      Map<Character, Integer> orgMap = new HashMap<>();
      for(int i = 0; i < S.length(); i++) {
        orgMap.put(S.charAt( i ), orgMap.getOrDefault(S.charAt( i ), 0) + 1);
      }
      int recipesCannotBePrepared = 0;
      for(int i = 0; i < A.length; i++) {
        Map<Character, Integer> tempMap = new HashMap<>( orgMap );
        for(char ch : A[i].toCharArray()) {
          if(tempMap.containsKey( ch )) {
            tempMap.put( ch, tempMap.get( ch ) - 1 );
            tempMap.remove( ch, 0 );
          } else {
            recipesCannotBePrepared++;
            break;
          }
        }
      }
      return A.length - recipesCannotBePrepared;
    }
  }
}
