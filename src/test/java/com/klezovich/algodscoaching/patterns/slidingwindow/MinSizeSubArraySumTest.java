package com.klezovich.algodscoaching.patterns.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubArraySumTest {

    @Test
    void test1() {
        assertEquals(2,MinSizeSubArraySum.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}));
    }
}