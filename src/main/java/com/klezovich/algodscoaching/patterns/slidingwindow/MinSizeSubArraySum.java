package com.klezovich.algodscoaching.patterns.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class MinSizeSubArraySum {


  public static int findMinSubArray(int S, int[] arr) {

      int windowStart=0;
      int minLen = Integer.MAX_VALUE;
      int windowSum=0;

      for(int windowEnd=0; windowEnd<=arr.length-1; windowEnd++) {
          windowSum+=arr[windowEnd];

          while(windowSum >= S) {
              minLen = Math.min(minLen, windowEnd - windowStart + 1);
              windowSum -=arr[windowStart];
              windowStart++;
          }
      }

      return minLen == Integer.MAX_VALUE ? 0 : minLen;
  }

}