package com.klezovich.algodscoaching.freestyle.sorting;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        return mergeSort(arr,0, arr.length-1);
    }

    public static int[] mergeSort(int[] arr, int start, int end) {

        if( (start == end)) {
            var res = new int[1];
            res[0]=arr[start];
            return res;
        }

        int mid = start + ((end-start)/2);

        int[] sortedSubarray1 = mergeSort(arr, start, mid);
        int[] sortedSubarray2 = mergeSort(arr, mid+1, end);

        int[] merged = merge(sortedSubarray1, sortedSubarray2);
        return merged;
    }

     static int[] merge(int[] sortedSubarray1, int[] sortedSubarray2) {

        if(sortedSubarray1.length == 0 ) {
            return sortedSubarray2;
        }

        if(sortedSubarray2.length == 0) {
            return sortedSubarray1;
        }

        var result = new ArrayDeque<Integer>();

        var q1 = toQueue(sortedSubarray1);
        var q2 = toQueue(sortedSubarray2);

        while (!q1.isEmpty() || !q2.isEmpty()) {

            if(q1.isEmpty()) {
                while (!q2.isEmpty()) {
                    result.add(q2.poll());
                }
                break;
            }

            if(q2.isEmpty()) {
                while (!q1.isEmpty()) {
                    result.add(q1.poll());
                }
                break;
            }

            int e1 = q1.peek();
            int e2 = q2.peek();

            if(e1 < e2) {
                result.add(q1.poll());
            } else {
                result.add(q2.poll());
            }
        }

        return toArray(result);
    }

    private static Queue<Integer> toQueue(int[] nums) {
        var q1 = (Queue<Integer>) new ArrayDeque<Integer>();

        for(int ii=0; ii<nums.length; ii++) {
            q1.add(nums[ii]);
        }

        return q1;
    }

    private static int[] toArray(Queue<Integer> q) {
        int[] nums = new int[q.size()];

        int pos=0;
        while (!q.isEmpty()) {
            nums[pos] = q.poll();
            pos++;
        }

        return nums;
    }
}
