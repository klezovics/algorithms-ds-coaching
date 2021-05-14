package com.klezovich.algodscoaching.patterns.twopointers;

class PairWithTargetSum {

  public static int[] search(int[] arr, int targetSum) {

    int leftPointer = 0;
    int rightPointer = arr.length - 1;

    while (leftPointer < rightPointer ) {
      int sum = arr[leftPointer] + arr[rightPointer];
      if(sum == targetSum) {
         return new int[]{leftPointer, rightPointer};
      }

      if(sum < targetSum) {
        leftPointer++;
      }

      if(sum > targetSum) {
        rightPointer--;
      }
    }

    return new int[] { -1, -1 };
  }

}