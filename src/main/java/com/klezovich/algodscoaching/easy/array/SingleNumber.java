package com.klezovich.algodscoaching.easy.array;

//Problem statement:
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(var num: nums) {
            result^=num;
        }

        return result;
    }
}
