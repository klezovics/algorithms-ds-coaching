package com.klezovich.algodscoaching.easy.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
public class RotateArray {

    //Rotates array to the right
    public void rotate(int[] nums, int k) {

        k=k%nums.length;

        if(nums.length == 1) {
            return;
        }

        var newArray = new int[nums.length];

        //copy k shifted elements
        int newArrayPos=0;
        for(int pos=nums.length-k; pos <=nums.length -1 ; pos++ ) {
            newArray[newArrayPos]=nums[pos];
            newArrayPos++;
        }

        //copy other elements
        for(int pos=0; pos<nums.length-k; pos++) {
            newArray[newArrayPos]=nums[pos];
            newArrayPos++;
        }

        for(int ii=0;ii<=nums.length-1; ii++) {
            nums[ii] = newArray[ii];
        }

        return;
    }
}
