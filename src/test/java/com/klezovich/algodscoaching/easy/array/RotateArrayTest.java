package com.klezovich.algodscoaching.easy.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RotateArrayTest {

    @Test
    void testRotations() {
        var rotator = new RotateArray();

        var arr = new int[]{1, 2, 3};
        rotator.rotate(arr, 1);
        assertTrue(Arrays.equals(new int[]{3, 1, 2}, arr));


        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        rotator.rotate(arr, 5);
        assertTrue(Arrays.equals(new int[]{6, 7, 8, 9, 10, 1, 2, 3, 4, 5}, arr));
    }
}