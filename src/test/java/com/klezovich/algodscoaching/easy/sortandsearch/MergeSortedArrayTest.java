package com.klezovich.algodscoaching.easy.sortandsearch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    private MergeSortedArray msa = new MergeSortedArray();

    @Test
    void test() {
        var nums1=new int[]{1,2,3,0,0,0};
        msa.merge(nums1, 3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(nums1));
        assertTrue(Arrays.equals(nums1, new int[]{1,2,2,3,5,6}));
    }

}