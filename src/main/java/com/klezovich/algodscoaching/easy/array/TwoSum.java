package com.klezovich.algodscoaching.easy.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var diffArray = getDiffArray(nums,target);

        for(int ii=0;ii<diffArray.length;ii++) {

            var desiredDiff = diffArray[ii];

            for(int jj=0;jj<nums.length;jj++) {
                if(ii == jj) {
                    continue;
                }

                if( desiredDiff == nums[jj]) {
                    return new int[]{ii,jj};
                }
            }
        }

        return null;
    }

    int[] getDiffArray(int[] nums, int target) {
        var diffArray = new int[nums.length];

        for(int ii=0;ii<nums.length;ii++) {
            diffArray[ii]=target-nums[ii];
        }

        return diffArray;
    }
}
