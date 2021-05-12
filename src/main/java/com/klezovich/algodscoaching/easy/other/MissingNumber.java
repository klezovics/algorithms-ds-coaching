package com.klezovich.algodscoaching.easy.other;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/722/
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int len = nums.length;

        int sumWithMissing = (len*(len+1))/2;

        return sumWithMissing-arraySum(nums);
    }

    private int arraySum(int[] nums) {
        int sum=0;
        for(int num: nums) {
            sum+=num;
        }

        return sum;
    }
}
