package com.klezovich.algodscoaching.easy.sortandsearch;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        var d1=toDeque(nums1,m);
        var d2=toDeque(nums2,n);

        var result = (Queue<Integer>)new ArrayDeque<Integer>();
        while (!d1.isEmpty() || !d2.isEmpty()) {

            if(d1.isEmpty()) {
                while (!d2.isEmpty()) {
                    var next = d2.poll();
                    result.add(next);
                }
                break;
            }

            if(d2.isEmpty()) {
                while (!d1.isEmpty()) {
                    var next = d1.poll();
                    result.add(next);
                }
                break;
            }

            var d1Top =d1.peek();
            var d2Top =d2.peek();

            if(d1Top < d2Top) {
                var top = d1.poll();
                result.add(top);
            } else {
                var top = d2.poll();
                result.add(top);
            }
        }

        int pos=0;
        while (!result.isEmpty()) {
            nums1[pos]=result.poll();
            pos++;
        }
    }

    private Deque<Integer> toDeque(int[] nums, int limit) {

        var deque = new ArrayDeque<Integer>();
        for(int ii=0;ii<limit;ii++) {
            deque.add(nums[ii]);
        }

        return deque;
    }
}
