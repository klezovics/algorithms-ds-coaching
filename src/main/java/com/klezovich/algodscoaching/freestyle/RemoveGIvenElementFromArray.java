package com.klezovich.algodscoaching.freestyle;

class RemoveGIvenElementFromArray {

    //OK, so the key idea is to use the sliding window approach
    public int removeElement(int[] nums, int val) {

        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            if(nums[0] == val) {
                return 0;
            }

            return 1;
        }

        //Again it is really good to maintain this invariant
        //Super helpful to reason about the problem
        //Olympiad programming is a lot about
        //coming up with good variable names for these intermediate
        //concepts
        int lastPosWithValRemoved=-1;
        for(int ii=0; ii<nums.length; ii++) {
            if(nums[ii] == val) {
                //If we find the value - skip
                continue;
            }

            //If the element is not equal to value - copy it
            lastPosWithValRemoved++;
            nums[lastPosWithValRemoved]=nums[ii];
        }

        return lastPosWithValRemoved+1;
    }


    public static void main(String[] args) {
        var s = new RemoveGIvenElementFromArray();

        //Should be 6
        System.out.println(s.removeElement(new int[]{0,1,1,2,2,2,3,3,3,3},3));

        //Should be 0
        System.out.println(s.removeElement(new int[]{0,0,0,0},0));
    }
}