package com.klezovich.algodscoaching.patterns.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumSubArrayOfSizeKTest {

    @Test
    void test1() {
        assertEquals(9, MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
    }

    @Test
    void test2() {
        assertEquals(7, MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[]{2, 3, 4, 1, 5}));
    }

}