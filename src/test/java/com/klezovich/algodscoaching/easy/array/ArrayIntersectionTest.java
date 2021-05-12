package com.klezovich.algodscoaching.easy.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntersectionTest {

    private ArrayIntersection ai = new ArrayIntersection();

    @Test
    void testIntersectionComputedCorrectly() {
        var result = ai.intersect(new int[]{1,2,2,1}, new int[]{2,2});
        assertTrue(Arrays.equals(new int[]{2,2}, result));
    }

    @Test
    void getNumberToCountMap() {
        var nums = new int[]{1,2,2,3,3,3};
        var map = ai.getNumberToCountMap(nums);

        assertEquals(1, map.get(1));
        assertEquals(2, map.get(2));
        assertEquals(3, map.get(3));
    }
}