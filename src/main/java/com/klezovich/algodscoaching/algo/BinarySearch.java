package com.klezovich.algodscoaching.algo;

public class BinarySearch {

    public static int search(int[] nums, int value) {
        return search(nums, 0, nums.length -1, value);
    }

    private static int search(int nums[], int l, int r, int value) {

        //The condition is interesting
        //I would not intuitively formulate it like this
        if(r >= l) {

            //Hmm... this formula is used
            //instead of looking at cases with n is odd
            //or n is even
            int mid = l + (r-l)/2;

            if(nums[mid] == value) {
                return mid;
            }

            if(value < nums[mid]) {
                return search(nums, l, mid-1, value);
            }

            return search(nums, mid+1, r, value);
        }

        return -1;
    }
}
