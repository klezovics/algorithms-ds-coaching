package com.klezovich.algodscoaching.freestyle.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {


    @Test
    void testMergeSortSimple() {
        assertTrue(Arrays.equals(new int[]{1}, MergeSort.mergeSort(new int[]{1})));
    }

    @Test
    void testMergeSort() {
        var result =  MergeSort.mergeSort(new int[]{5,2,1,3,4});
        System.out.println(Arrays.toString(result));

        assertTrue(Arrays.equals(new int[]{1,2,3,4,5}, result));
    }

    @Test
    void testMergeStep() {
        var merged = MergeSort.merge(new int[]{1,3,5,7}, new int[]{2,4,6,8});
        assertTrue(Arrays.equals(merged, new int[]{1,2,3,4,5,6,7,8}));


        merged = MergeSort.merge(new int[]{1}, new int[]{2});
        assertTrue(Arrays.equals(merged, new int[]{1,2}));
    }
}