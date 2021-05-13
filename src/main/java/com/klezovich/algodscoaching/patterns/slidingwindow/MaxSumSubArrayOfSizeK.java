package com.klezovich.algodscoaching.patterns.slidingwindow;

import java.util.Arrays;

class MaxSumSubArrayOfSizeK {

  private static int[] array;
  private static int windowLength;

  private static int[] windowsSum;

  //https://www.educative.io/courses/grokking-the-coding-interview/JPKr0kqLGNP
  //Let's use the sliding window approach to solve this problem
  public static int findMaxSumSubArray(int k, int[] arr) {

    array = arr;
    windowLength=k;

    //There is a total of 1 + N - K windows
    //The Mth window starts at M
    //The Mth window ends at M+K-1
    int numWindows = 1 + arr.length - k;
    windowsSum = new int[numWindows];

    int zeroWindowSum = calcWindowSum(windowStartPos(0), windowsEndPos(0));
    windowsSum[0] = zeroWindowSum;

    //We have the sum for the 0th window
    //Lets use it to compute the sums of all other windows in a smart way
    //Once the window slides the first element in the widnow gets removed
    //The next element after the window gets added
    for(int windowNum=1; windowNum <= numWindows-1; windowNum++ ) {
       windowsSum[windowNum] = windowsSum[windowNum-1]
               - array[windowStartPos(windowNum-1)]
               + array[windowsEndPos(windowNum-1)+1];
    }


    return Arrays.stream(windowsSum).max().getAsInt();
  }

  private static int calcWindowSum(int windowStart, int windowEnd) {
     int sum=0;
     for(int ii=windowStart; ii<=windowEnd; ii++ ) {
        sum+=array[ii];
     }

     return sum;
  }

  private static int windowStartPos(int windowNum) {
     return windowNum;
  }

  private static int windowsEndPos(int windowNum) {
    return windowNum + windowLength - 1;
  }
}