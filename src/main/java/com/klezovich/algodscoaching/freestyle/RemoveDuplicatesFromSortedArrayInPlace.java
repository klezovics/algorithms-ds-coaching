package com.klezovich.algodscoaching.freestyle;

class RemoveDuplicatesFromSortedArrayInPlace {

    //OK, so the key idea is to use the sliding window approach
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return 1;
        }

        //Good idea with the variable name ...
        //Makes it easier to reason about the problem
        int lastPosWithoutDuplicates=0;

        //OK, so a sliding window of size 2
        for (int pos=1;pos<=nums.length-1;pos++) {

            //Found duplicate
            if(nums[pos-1] == nums[pos]) {
                //If we find a duplicate - do nothing and ignore
                //And this is the key idea ... so sliiiiiide past the duplicates
            } else {

                //We slide past the duplicates and if we see
                //something new ... we add it to the relevant position

                //If the numbers are different ..
                //add the next one to the array
                lastPosWithoutDuplicates++;
                nums[lastPosWithoutDuplicates] = nums[pos];
            }
        }

        //array size is lastIndex+1
        return lastPosWithoutDuplicates + 1;
    }


    public static void main(String[] args) {
        var s = new RemoveDuplicatesFromSortedArrayInPlace();
        System.out.println(s.removeDuplicates(new int[]{0,1,1,2,2,2,3,3,3,3}));
        System.out.println(s.removeDuplicates(new int[]{0,0,0,0}));
    }
}