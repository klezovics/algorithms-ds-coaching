package com.klezovich.algodscoaching.freestyle;

import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class MyArrays {

    public static int getSum(Integer[] arr) {
        int sum = 0;
        for (int ii = 0; ii < arr.length; ii++) {
            sum += arr[ii];
        }

        return sum;
    }

    public static int getWindowSum(Integer[] arr, int windowStart, int windowEnd) {

        if(arr.length == 0) {
            return 0;
        }

        validateStartAndEndPos(windowStart, windowEnd, arr.length);

        int sum=0;
        for(int pos=windowStart; pos<=windowEnd; pos++) {
            sum+=arr[pos];
        }

        return sum;
    }

    public static List<List<Integer>> getAllSubarraysOfSizeK(Integer[] arr, int k) {
        var subarrays = new ArrayList<List<Integer>>();

        if(k == 0) {
            return subarrays;
        }

        int subarrayStart=0;

        //The last position of k-length subarray must be
        // no more than the last position in the array
        while (subarrayStart + k - 1 <= arr.length - 1) {
           var subarray = new ArrayList<Integer>();

           //Copy all the subarray elements
           for(int ii=subarrayStart;ii<=subarrayStart+k-1;ii++) {
               subarray.add(arr[ii]);
           }
           subarrays.add(subarray);
           subarrayStart++;
        }

        return subarrays;
    }

    private static void validateStartAndEndPos(int startPos, int endPos, int arrLen) {
        if (startPos < 0 || startPos > arrLen - 1) {
            throw new IllegalArgumentException("Invalid start position");
        }

        if (endPos < 0 || endPos > arrLen -1) {
            throw new IllegalArgumentException("Invalid end position");
        }

        if (endPos < startPos) {
            throw new IllegalArgumentException("End position is smaller than start pos");
        }
    }
}
