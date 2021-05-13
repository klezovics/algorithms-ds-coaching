package com.klezovich.algodscoaching.patterns.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class MinSizeSubArraySum {

  private static int[] array;
  private static int targetSum;

  public static int findMinSubArray(int S, int[] arr) {

    array=arr;
    targetSum=S;

    Integer[] bestLenForStartAtPos= new Integer[arr.length];

    //Find the shortest value for each position
    for(int startPos=0; startPos<=arr.length-1; startPos++) {
       bestLenForStartAtPos[startPos] = findMinLengthForSubarrayWithStartPos(startPos);
    }

    //Find the position with the best result;
    List<Integer> vals = new ArrayList<>();

    for(Integer val : bestLenForStartAtPos) {
      if(val == null) {
        continue;
      }

      if(val == 0) {
          continue;
      }

      vals.add(val);
    }


    //Sum is not reachable at all
    if(vals.size() == 0) {
      return 0;
    }

    return vals.stream().mapToInt(v->v).min().getAsInt();
  }

  private static int findMinLengthForSubarrayWithStartPos(int startPos) {
      int sum=0;
      int pos=startPos;
      int len=0;
      while (sum < targetSum && pos < array.length) {
        sum+=array[pos];
        pos++;
        len++;
      }

      if(sum < targetSum) {
          return 0;
      }

      return len;
  }
}