package com.klezovich.algodscoaching.freestyle.bitwise;

import lombok.val;

import java.util.Arrays;

//Key idea ... we get the subset by number in a clever way ...
public class SubsetGeneration {

    static int[] getNthSubset(int subsetNum, int elementNum) {

        //In this array we describe - which elements are in and which
        //are out for a specific set
        int[] result = new int[elementNum];

        //Going through every bit in the array to find out
        //if its in or not
        for(int ii=0;ii<elementNum;ii++) {

            //Mask is used to check if a specific bit is set
            int isNthBitSetMask = 1 << ii;

            //Check if the bit is set or not
            int isNthBitSet = subsetNum & isNthBitSetMask;

            if( isNthBitSet != 0) {
                //Writing elements from right to left so it works with Arrays.print() :)
                result[elementNum-ii-1]=1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        for(int ii=0;ii<16;ii++) {
            System.out.println(ii+":"+Arrays.toString(getNthSubset(ii,4)));
        }
    }
}
